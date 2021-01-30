package Practice_BookSystem;
// 把多个 Book 对象组织起来
public class BookList {
    // 100 为这个 BookList 的最大容量
    private Book[] books = new Book[100];
    private int size = 0; // 当前是 0 个书的信息

    public BookList() {
        books[0] = new Book("西游记","吴承恩",100.5,"小说");
        books[1] = new Book("红楼梦","曹雪芹",99.9,"小说");
        books[2] = new Book("三国演义","罗贯中",101,"小说");
        books[3] = new Book("水浒传","施耐庵",110.3,"小说");
        size = 4;
    }

    public Book getBook(int index){
        return books[index];
    }

    public void setBook(int index, Book book){
        books[index] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
