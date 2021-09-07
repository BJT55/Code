import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int m = in.nextInt();
            int n = in.nextInt();
            in.nextLine();
            char[][] arr = new char[m][n];
            String[] s = new String[m];
            for (int i = 0; i < m; i++) {
                s[i] = in.nextLine();
                arr[i] = s[i].toCharArray();
            }
            System.out.println(findFlower(arr,m,n));
        }
    }

    private static int findFlower(char[][] arr, int m, int n) {
        int count = 0;
        for (int i = 1; i < m; i++){
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 'F'){
                    int up = i-1, down = i+1, left = j-1, right = j+1;
                    if (up >= 0) arr[up][j] = 'M';
                    if (down < m) arr[down][j] = 'M';
                    if (left >= 0) arr[i][left] = 'M';
                    if (right < n) arr[i][right] = 'M';
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 'F'){
                    count++;
                }
            }
        }
        return count;
    }
}
