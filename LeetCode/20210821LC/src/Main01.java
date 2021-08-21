import java.util.Arrays;
import java.util.Scanner;
// 魔法师过河
public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt(); // 表示石头个数
            String[] s = new String[n];
            int white = 0, black = 0, blank = 0; // 黑水晶, 白水晶, 空白水晶个数
            int[] powerWhite = new int[n]; // 需要白水晶的能量值
            int[] powerBlack = new int[n];
//            int index = 0;
            for (int i = 0; i < n; i++) {
                s[i] = in.nextLine();
                if (s[i].equals("1")){
                    white++;
                }else if (s[i].equals("2")){
                    black++;
                }else {
                    blank++;
                    powerWhite[black-1] = s[i].charAt(2);
                    powerBlack[blank-1] = s[i].charAt(4);
                }
            }

            // 计算黑白水晶需要多少个
            int needWhite = needCristal(white,black,blank);
            int needBlack = black-needWhite;
            if (needBlack < 0 || needWhite < 0) {
                System.out.println(-1);
            }

            // 计算需要的最小能量值
            int minPower = 0;
            Arrays.sort(powerWhite);
            Arrays.sort(powerBlack);
            for (int i = 0; i < needWhite; i++) {
                minPower+=powerWhite[i];
            }
            for (int i = 0; i < needBlack; i++) {
                minPower+=powerBlack[i];
            }
            System.out.println(minPower);
        }
    }

    private static int needCristal(int white, int black, int blank) {
        for (int i = 0; i <= blank; i++){
            if (white+i == black+(black-i)){
                return i;
            }
        }
        return -1;
    }
}
