import java.util.Scanner;

public class Day21_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int group = in.nextInt(); // 数据组数
            StringBuilder res = new StringBuilder();
            while (group>0){
                int n = in.nextInt(); // 个数
                int k = in.nextInt(); // 洗牌次数
                int[] card = new int[2*n];
                for (int i = 0; i < card.length; ++i){
                    card[i] = in.nextInt();
                }
                res = new StringBuilder();
                // 洗牌次数
                while (k > 0){
                    shuffleCard(card,k);
                    k--;
                }
                // 将洗好的牌放入 res 中
                for (int num : card){
                    res.append(num+" ");
                }
                System.out.println(res.toString().trim());
                group--;
            }

        }
    }
    public static void shuffleCard(int[] card, int k){
        int[] left = new int[card.length/2];
        int[] right = new int[card.length/2];
        for (int i = 0; i < card.length; ++i){
            if (i < card.length/2){
                left[i] = card[i];
            }else {
                right[i-card.length/2] = card[i];
            }
        }

        int m = card.length/2 - 1, n = card.length - 1;
        while (m >= 0 && n >= 0){
            card[n--] = right[m];
            card[n--] = left[m];
            m--;
        }
    }
}
