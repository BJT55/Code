package Practice_BookSystem.operation;

import Practice_BookSystem.Book;
import Practice_BookSystem.BookList;

import java.util.Scanner;

//还书
public class Return implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("您已进入还书模块...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要归还的书籍名称：");
        String name = scanner.next();

        int i = 0;
        for (; i < bookList.getSize(); i++){
            if (bookList.getBook(i).getName().equals(name)){
                break;
            }
        }
        // 未找到
        if ( i >= bookList.getSize()){
            System.out.println("未找到指定的书籍，无法归还...");
            return;
        }
        // 找到了，判断是否为借阅状态
        Book currentBook = bookList.getBook(i);
        if (!currentBook.isBorrowed()){
            System.out.println("该书籍未被借出，无法归还...");
            return;
        }
        bookList.getBook(i).setBorrowed(false);
        System.out.println("归还完毕...");
        return;
    }
}
