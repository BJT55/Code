import java.util.Scanner;

public class GoBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Character[][] map = new Character[20][20];
            for (int i = 0; i < 20; i ++ ) {
                String s = sc.next();
                for (int j = 0; j < 20; j ++ ) {
                    map[i][j] = s.charAt(j);
                }
            }
            if(check(map))
                System.out.println("Yes");
            else System.out.println("No");
        }
    }
    public static boolean check(Character[][] arr){
        for (int i = 0; i < 20; ++i){
            for (int j = 0; j < 20; ++j){
                if (arr[i][j] == '.'){ // 非棋子
                    continue;
                }
                // 向四个方向 ( → ← ↘ ↙ )
                int right = 1, down = 1, right_down = 1, left_down = 1;
                    for (int t = 1; t < 5; ++t){
                        if (j < 16 && arr[i][j] == arr[i][j+t]){
                            right++;
                        }
                        if (i < 16 && arr[i][j] == arr[i+t][j]){
                            down++;
                        }
                        if (j < 16 && i < 16 && arr[i][j] == arr[i+t][j+t]){
                            right_down++;
                        }
                        if (j > 3 && i > 3 && arr[i][j] == arr[i-t][j-t]){
                            left_down++;
                        }
                    }
                    if (right == 5 || down == 5 || right_down == 5 || left_down == 5){
                        return true;
                    }
            }
        }
        return false;
    }
}
