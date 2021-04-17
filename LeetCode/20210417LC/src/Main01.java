import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int w = in.nextInt();
            int h = in.nextInt();
            System.out.println(Solution(w,h));
        }
    }
    public static int Solution(int w, int h){
        boolean[][] flag = new boolean[w][h];
        for (int i = 0; i < w; ++i){
            for (int j = 0; j < h; ++j){
                flag[i][j] = true;
            }
        }


        int count = 0;
        for (int i = 0; i < w; ++i){
            for (int j = 0; j < h; ++j){
                if(!flag[i][j]){
                    continue;
                }else if(j+2 < h && flag[i][j+2]){
                    flag[i][j+2] = false;
                }else if (i+2 < w && flag[i+2][j]){
                    flag[i+2][j] = false;
                }
                count++;
            }
        }
        return count;
    }
}
