import java.util.Scanner;

public class Day06_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] cakes = new int[row][col];

        int count = 0;
        for (int i = 0; i < row; ++i){
            for (int j = 0; j < col; ++j){
                if (cakes[i][j] == 0){
                    count++;
                    if (i+2 < row){
                        cakes[i+2][j] = 1;
                    }
                    if (j+2 < row){
                        cakes[i][j+2] = 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
