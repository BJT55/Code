package Practice_BookSystem;

import Practice_BookSystem.operation.*;

import java.util.Scanner;

public class Admin extends User{
    public Admin(String name){
        this.name = name;
        this.operations = new IOperation[] {
                new Add(),
                new Delete(),
                new Search(),
                new Update(),
                new Show(),
                new Borrow(),
                new Return(),
                new Exit()
        };
    }

    @Override
    public int menu() {
        System.out.println("********************************************");
        System.out.println("    ***欢迎 "+name+" 管理员使用图书管理系统***");
        System.out.println("*******************  目录  ******************");
        System.out.println("               1.添加书籍信息");
        System.out.println("               2.删除书籍信息");
        System.out.println("               3.查找书籍信息");
        System.out.println("               4.更新书籍信息");
        System.out.println("               5.浏览书籍信息");
        System.out.println("               6.借阅书籍");
        System.out.println("               7.归还书籍");
        System.out.println("               8.退出系统");
        System.out.println("********************************************");
        System.out.println("请输入您的选择： ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
