package practice;
// 一张扑克牌
public class Card {
    // 花色
    public String suit;
    // 点数
    public String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // 打印拍的内容，重写 toString 内容

    @Override
    public String toString() {
        return "(" + this.suit + this.rank +
                ") ";
    }
}
