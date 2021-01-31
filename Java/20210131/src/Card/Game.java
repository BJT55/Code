package Card;

import java.util.*;

public class Game {
    public static final String[] suit = {"♣","♦","♠","♥"};
    public static final String[] rank = {
            "3","4","5","6","7","8","9","10",
            "J","Q","K","A","2"
    };
    public static List<Card> buyPoker(){
        List<Card> poker = new ArrayList<>();
        for (int i = 0; i < suit.length; i++){
            for (int j = 0; j < rank.length; j++){
                poker.add(new Card(suit[i],rank[j]));
            }
        }
        poker.add(new Card("Red","Joker"));
        poker.add(new Card("Black","Joker"));

        return poker;
    }

    public static void main(String[] args) {
        // 创建扑克牌
        List<Card> poker = buyPoker();
        // 洗牌
        Collections.shuffle(poker);
        // 发牌
        List< List<Card>> players = new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for (int i = 0; i < 54 / players.size(); i++){
            for (int j = 0; j < players.size(); j++){
                Card top = poker.remove(0);
                List<Card> player = players.get(j);
                player.add(top);
            }
        }
        // 展示手牌
        for (int i = 0; i < players.size(); i++){
            List<Card> player = players.get(i);
            System.out.println("玩家" + ( i + 1 ) + "的手牌是：" + player);
        }
    }
}
