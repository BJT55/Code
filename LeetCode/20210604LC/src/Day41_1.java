import java.util.Scanner;

public class Day41_1 {
    public static void main(String[] args) {
        char[][] arr = new char[20][20];
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            for (int i = 0; i < 20; ++i){
                String s = in.nextLine();
                arr[i] = s.toCharArray();
            }

            if (check(arr)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
    public static int count = 1;
    public static boolean check(char[][] arr){
        // 纵向:
        for (int i = 1; i < 20; ++i){
            for (int j = 0; j < 20; ++j){
                if (arr[i][j] == arr[i-1][j] && (arr[i][j] == '*' || arr[i][j] == '+')){
                    count++;
                    if (count >= 5){
                        return true;
                    }
                }else {
                    count = 1;
                }
            }
        }
        count = 1;
        // 横向:
        for (int i = 0; i < 20; ++i){
            for (int j = 1; j < 20; ++j){
                if (arr[i][j] == arr[i][j-1] && (arr[i][j] == '*' || arr[i][j] == '+')){
                    count++;
                    if (count >= 5){
                        return true;
                    }
                }else {
                    count = 1;
                }
            }
        }
        count = 1;
        // 斜着(↘)
        for (int i = 1; i < 20; ++i){
            for (int j = 1; j < 20; ++j){
                if (arr[i][j] == arr[i-1][j-1] && ( arr[i][j] == '*' || arr[i][j] == '+')){
                    count++;
                    if (count >= 5){
                        return true;
                    }
                }else {
                    count = 1;
                }
            }
        }
        // 斜着(↙)
        for (int i = 1; i < 20; ++i){
            for (int j = 18; j > 0; --j){
                if (arr[i][j] == arr[i-1][j+1] && ( arr[i][j] == '*' || arr[i][j] == '+')){
                    count++;
                    if (count >= 5){
                        return true;
                    }
                }else {
                    count = 1;
                }
            }
        }
        return false;
    }
}
