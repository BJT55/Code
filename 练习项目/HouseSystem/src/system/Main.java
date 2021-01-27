package system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 创建房屋列表
        HouseList houseList = new HouseList();
        // 创建用户
        User user = login();
        // 进入用户选择循环
        while (true){
            int choice = user.menu();
            user.doFunction(choice,houseList);
        }
    }

    // 实现登录
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名： ");
        String name = scanner.next();
        System.out.println("请输入您的角色： （1.售房人员 2.购房用户）");
        int who = scanner.nextInt();
        while (true){
            if (who == 1){
                return new Saler(name);
            }else if (who == 2){
                return new Customer(name);
            }else {
                System.out.println("您的角色输入有误，请重新输入：");
                who = scanner.nextInt();
            }
        }
    }
}
