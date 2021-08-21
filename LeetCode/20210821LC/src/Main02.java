import java.util.Scanner;
// 发零食
public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            in.nextLine();
            String[] s = new String[n];
            char[][] c = new char[n][n];
            for (int i = 0; i < n; i++) {
                s[i] = in.nextLine();
                for (int j = 0; j < n; j++) {
                    c[i][j] = s[i].charAt(j);
                }
            }
            boolean[][] visited = new boolean[n][n];
            visited[0][0] = true;
            System.out.println(recur(c,n,0,0 ,visited));
        }
    }

    private static int recur(char[][] c, int n, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= n || j < 0 || j >= n || c[i][j] == '#' || !visited[i][j]) {
            return 0;
        }
        if (i == n-1 && j == n-1 && c[i][j] == '.' ) {
            return 1;
        }
        c[i][j] = '#';
        visited[i][j] = true;
        int res = recur(c, n, i+1, j,visited) +
                recur(c, n, i-1, j,visited) +
                recur(c, n, i, j+1,visited) +
                recur(c, n, i, j-1,visited)+1;
        c[i][j] = '.';
        visited[i][j] = false;
        return res;
    }
}
