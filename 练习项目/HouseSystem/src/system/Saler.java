package system;

import system.function.*;
import java.util.Scanner;


public class Saler extends User{
    public Saler(String name) {
        this.name = name;
        this.functions = new IFunction[]{
                new Add(),
                new Delete(),
                new Search(),
                new Show(),
                new Buy(),
                new Return(),
                new End()
        };
    }

    @Override
    public int menu() {
        System.out.println();
        System.out.println("*********************************************");
        System.out.println("    ***欢迎 "+name+" 使用 XXX小区 售房系统***");
        System.out.println("********************  目录  ******************");
        System.out.println("               1.添加房屋信息");
        System.out.println("               2.删除房屋信息");
        System.out.println("               3.查找房屋信息");
        System.out.println("               4.浏览房屋信息");
        System.out.println("               5.购 买 房 屋");
        System.out.println("               6.退 还 房 屋");
        System.out.println("               7.退 出 系 统");
        System.out.println("*********************************************");

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
