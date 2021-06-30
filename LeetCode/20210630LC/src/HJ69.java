import java.util.*;
public class HJ69 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int[][] a = new int[x][y];
            int[][] b = new int[y][z];
            // 初始化 a , b
            for(int i = 0; i < x; ++i){
                for(int j = 0; j < y; ++j){
                    a[i][j] = in.nextInt();
                }
            }
            for(int i = 0; i < y; ++i){
                for(int j = 0; j < z; ++j){
                    b[i][j] = in.nextInt();
                }
            }

            // a b 矩阵相乘
            for(int i = 0; i < x; ++i){
                for(int j = 0; j < z; ++j){
                    int tmp = 0;
                    for(int k = 0; k < y; ++k){
                        tmp += a[i][k]*b[k][j];
                    }
                    System.out.print(tmp+" ");
                }
                System.out.println();
            }
        }
    }
}