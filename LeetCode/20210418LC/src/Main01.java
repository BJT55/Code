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
    public static long Solution(int w, int h){
        long res = 0;
        boolean[][] noCake = new boolean[w][h];
        for (int i = 0; i < w; ++i){
            for (int j = 0; j < h; ++j){
                noCake[i][j] = true;
            }
        }

        for (int i = 0; i < w; ++i){
            for (int j = 0; j < h; ++j){
                if (!noCake[i][j]){
                    continue;
                }
                else if (j+2 < h &&noCake[i][j+2]){
                    noCake[i][j+2] = false;
                }
                else if(i+2 < w && noCake[i+2][j]){
                    noCake[i+2][j] = false;
                }
                res++;
            }
        }
        return res;
    }
}
