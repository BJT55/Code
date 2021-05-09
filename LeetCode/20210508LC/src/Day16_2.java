import java.util.Scanner;

public class Day16_2 {
    // 扑克牌大小
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] cards = s.split("-");
        String[] card1 = cards[0].split(" ");
        String[] card2 = cards[1].split(" ");
        String rule = "34567891JQKA2";

        if (cards[0].equals("joker JOKER") || cards[1].equals("joker JOKER")){
            System.out.println("joker JOKER");
        }
        else if (card1.length == card2.length){
            if (rule.indexOf(card1[0].substring(0,1))  > rule.indexOf(card2[0].substring(0,1))){
                System.out.println(cards[0]);
            }else {
                System.out.println(cards[1]);
            }
        }
        else if (card1.length == 4){
            System.out.println(cards[0]);
        }
        else if (card2.length == 4){
            System.out.println(cards[1]);
        }
        else {
            System.out.println("ERROR");
        }
    }
}
