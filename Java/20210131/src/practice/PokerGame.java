package practice;

import java.util.*;

public class PokerGame {
    // 使用数组存放四种花色
    public static final String[] suit = {"♠","♥","♦","♣"};

    public static List<Card> buyPoker(){
        List<Card> poker = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            // 处理四种花色
            for (int j = 2; j <= 10; j++){
                // 处理每种花色的十三张牌
                poker.add(new Card(suit[i],String.valueOf(j)));
            }
            poker.add(new Card(suit[i],"J"));
            poker.add(new Card(suit[i],"Q"));
            poker.add(new Card(suit[i],"K"));
            poker.add(new Card(suit[i],"A"));
        }
        poker.add(new Card("","Red Joker"));
        poker.add(new Card("","Black Joker"));

        return poker;
    }

    // List 自身是可变对象，直接修改 poker 的内容就会对 List 本身造成影响
    public static void shuffle(List<Card> poker){
        Random ran = new Random();
        for (int i = poker.size() - 1; i > 0; i--){
            // 产生随机数（0,1），表示要和哪一个位置元素进行交换
            int pos = ran.nextInt(i);
            swap(poker,i,pos);
        }
    }

    private static void swap(List<Card> poker, int i, int pos) {
        Card tmp = poker.get(i);
        poker.set(i,poker.get(pos));
        poker.set(pos,tmp);
    }

    public static void main(String[] args) {
        // 1.创建衣服扑克牌
        List<Card> poker = buyPoker();

        // 2.洗牌
//        shuffle(poker);
        // 可以使用标准库自带的洗牌方法
        Collections.shuffle(poker);
//        System.out.println(poker);


        // 3.发牌（3个玩家，每次发 5 张牌）
//        List<Card> player1 = new ArrayList<>();
//        List<Card> player2 = new ArrayList<>();
//        List<Card> player3 = new ArrayList<>();
        //也可以吧三个玩家都放入一个人 List 中
        List< List<Card> > players = new ArrayList<>();
        // 每次 add 的元素都是一个 ArrayList<Card> 类型
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 3; j++){
                Card top = poker.remove(0);
                List<Card> player = players.get(j);
                player.add(top);
            }
        }


        // 4.展示手牌
        for (int i = 0; i < players.size(); i++){
            List<Card> player = players.get(i);
            System.out.println("玩家" + ( i + 1 ) + "的手牌是：" + player);
        }

    }



}
