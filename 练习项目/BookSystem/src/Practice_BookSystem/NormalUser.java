package Practice_BookSystem;

import Practice_BookSystem.operation.*;
import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name){
        this.name = name;
        this.operations = new IOperation[] {
                new Borrow(),
                new Return(),
                new Search(),
                new Show(),
                new Exit()
        };
    }

    @Override
    public int menu() {
        System.out.println("********************************************");
        System.out.println("     ***欢迎 "+name+" 用户使用图书管理系统***");
        System.out.println("*******************  目录  ******************");
        System.out.println("               1.借 阅 书 籍");
        System.out.println("               2.归 还 书 籍");
        System.out.println("               3.查找书籍信息");
        System.out.println("               4.浏览书籍信息");
        System.out.println("               5.退 出 系 统");
        System.out.println("********************************************");

        System.out.println("请输入您的选择： ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (true){
            if ( choice <= 5 && choice >= 1){
                return choice;
            }else {
                System.out.println("输入有误，请重新输入...");
                choice = scanner.nextInt();
            }
        }
    }
}
