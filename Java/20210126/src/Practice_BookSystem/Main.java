package Practice_BookSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.创建图书列表
        BookList bookList = new BookList();
       // 2.创建用户
        User user = login();
        //3.进入主循环
        while (true){
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }
    }

    // 实现登录
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名： ");
        String name = scanner.next();
        System.out.println("请输入您的角色： （1.管理员 2.普通用户）");
        int who = scanner.nextInt();
        if (who == 1){
            return new Admin(name);
        }else if (who == 2){
            return new NormalUser(name);
        }else {
            System.out.println("您的角色输入有误，请重新输入：");
            who = scanner.nextInt();
        }
        return null;
    }
}
