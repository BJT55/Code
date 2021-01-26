package Practice_BookSystem.operation;

import Practice_BookSystem.BookList;

import java.util.Scanner;

// 添加书的信息
public class Add implements IOperation{
    @Override
    public void work(BookList bookList){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入图书的名称：");
        String name = scanner1.next();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入图书的作者：");
        String author = scanner2.next();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("请输入图书的价格：");
        double price = scanner3.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("请输入图书的类型：");
        String type= scanner4.next();


    }
}
