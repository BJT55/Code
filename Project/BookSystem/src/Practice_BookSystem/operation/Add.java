package Practice_BookSystem.operation;

import Practice_BookSystem.Book;
import Practice_BookSystem.BookList;

import java.util.Scanner;

// 添加书的信息
public class Add implements IOperation {
    @Override
    public void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("您已进入增添模块...");
        System.out.println("请输入新的书籍名称： ");
        String name = scanner.next();

        System.out.println("请输入新的书籍作者： ");
        String author = scanner.next();

        System.out.println("请输入新的书籍价格： ");
        double price = scanner.nextDouble();

        System.out.println("请输入新的书籍类型： ");
        String type = scanner.next();

        // 将新增的书籍的信息放入 Book 中
        Book newBook = new Book(name,author,price,type);

        // 将新增的书籍放入 BookList 末尾
        int currentSize = bookList.getSize();
        bookList.setBook(currentSize,newBook);
        bookList.setSize(currentSize+1);

        System.out.println("新增书籍完毕...");

    }
}
