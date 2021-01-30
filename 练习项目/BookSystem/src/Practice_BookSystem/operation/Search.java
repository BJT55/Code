package Practice_BookSystem.operation;

import Practice_BookSystem.BookList;

import java.util.Scanner;

//查找
public class Search implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("您已进入查找模块...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的书名");
        String name = scanner.next();

        for (int i = 0; i < bookList.getSize(); i++){
            if (bookList.getBook(i).getName().contains(name)){
                System.out.println(bookList.getBook(i));
            }
        }
    }
}
