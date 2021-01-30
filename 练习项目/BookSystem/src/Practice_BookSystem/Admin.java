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
                new Show(),
                new Borrow(),
                new Return(),
                new Exit()
        };
    }

    @Override
    public int menu() {
        System.out.println("********************************************");
        System.out.println("     ***欢迎 "+name+" 管理员使用图书管理系统***");
        System.out.println("*******************  目录  ******************");
        System.out.println("               1.添加书籍信息");
        System.out.println("               2.删除书籍信息");
        System.out.println("               3.查找书籍信息");
        System.out.println("               4.浏览书籍信息");
        System.out.println("               5.借 阅 书 籍");
        System.out.println("               6.归 还 书 籍");
        System.out.println("               7.退 出 系 统");
        System.out.println("********************************************");

        System.out.println("请输入您的选择： ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (true){
            if ( choice <= 7 && choice >= 1){
                return choice;
            }else {
                System.out.println("输入有误，请重新输入...");
                choice = scanner.nextInt();
            }
        }

    }
}
