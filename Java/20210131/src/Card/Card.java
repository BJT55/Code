package Card;
// 一张扑克牌信息
public class Card {
    // 花色
    public String suit;
    // 点数
    public String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "(" + this.suit + this.rank + ")";
    }
}
