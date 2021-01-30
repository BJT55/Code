package Practice_BookSystem;
// 用来表示一本书的信息
public class Book {
    private String name;
    private String author;
    private double price;
    private String type;
    private boolean isBorrowed = false;

    // 使用构造方法针对这些私有成员进行初始化
    public Book(String name, String author, double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}
