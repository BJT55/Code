import java.util.Scanner;
import java.util.Stack;

public class Day21_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int group = in.nextInt(); //输入组数
            while (group > 0) {
                int n = in.nextInt();  // 牌数
                int count = in.nextInt();  // 洗牌次数
                int[] cards = new int[2 * n];
                for (int i = 0; i < cards.length; ++i) {
                    cards[i] = in.nextInt();
                }
                // 洗牌 count 次
                while (count > 0){
                    playCard(cards,count);
                    count--;
                }
                StringBuilder res = new StringBuilder();
                for (int num : cards){
                    res.append(num+" ");
                }
                System.out.println(res.toString().trim());
                group--;
            }
        }
    }
    public static void playCard(int[] cards, int count){
        Stack<Integer> stack = new Stack<>();
        int left = cards.length/2-1, right = cards.length-1;
        while (left >= 0){
            stack.push(cards[right--]);
            stack.push(cards[left--]);
        }
        int n = 0;
        while (!stack.isEmpty()){
            cards[n++] = stack.pop();
        }
        return;
    }
}
