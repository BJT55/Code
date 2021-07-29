package Practice_BookSystem.operation;

import Practice_BookSystem.Book;
import Practice_BookSystem.BookList;

import java.util.Scanner;

// 借书
public class Borrow implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("您已进入借书模块...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要借阅的数据名称：");
        String name = scanner.next();

        int i = 0;
        for (; i < bookList.getSize(); i++){
            if (bookList.getBook(i).getName().equals(name)){
                break;
            }
        }
        // 未找到
        if ( i >= bookList.getSize()){
            System.out.println("未找到指定的书籍，无法借阅...");
            return;
        }
        // 找到了
        Book currentBook = bookList.getBook(i);
        if (currentBook.isBorrowed()){
            System.out.println("该书籍已被借阅...");
            return;
        }
        bookList.getBook(i).setBorrowed(true);
        System.out.println("借阅完毕...");
        return;

    }
}
