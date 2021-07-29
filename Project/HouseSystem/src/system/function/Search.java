package system.function;
import system.HouseList;

import java.util.Scanner;

public class Search implements IFunction{
    @Override
    public void operate(HouseList houseList) {
        System.out.println("您已进入[ 查找 ]功能...");
        System.out.println("***************");
        System.out.println("1.按照房屋地址查找");
        System.out.println("2.按照房屋类型查找");
        System.out.println("3.按照房屋面积查找");
        System.out.println("0.退  出  查  找");
        System.out.println("***************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要查找的房屋的方式：(1.按地址 2.按类型 3.按面积 0.退出）");
        int number = scanner.nextInt();
        a:while (true){
            boolean search = false; // 标志是否查询到
            switch (number){
                case 1:
                    System.out.println("请输入要查找的房屋地址：");
                    String address = scanner.next();
//                    search = false;
                    for (int i = 0; i < houseList.getCount(); i++){
                        if (address.equals(houseList.getHouse(i).getAddress())){
                            System.out.println(houseList.getHouse(i));
                            search = true;
                            break;
                        }
                    }
                    if ( !search ){
                        System.out.println("系统中未找到该房屋信息...");
                    }
                    break;
                case 2:
                    System.out.println("请输入要查找的房屋类型：");
                    String type = scanner.next();
                    for (int j = 0; j < houseList.getCount(); j++){
                        //模糊查询
                        if (houseList.getHouse(j).getType().contains(type)){
                            System.out.println(houseList.getHouse(j));
                            search = true;
                        }
                    }
                    if (!search){
                        System.out.println("系统中未找到该房屋信息...");
                    }
                    break;
                case 3:
                    System.out.println("请输入要查找的房屋面积：");
                    double area = scanner.nextDouble();
                    for (int j = 0; j < houseList.getCount(); j++){
                        //模糊查询
                        if (area == houseList.getHouse(j).getArea()){
                            System.out.println(houseList.getHouse(j));
                            search = true;
                        }
                    }
                    if (!search){
                        System.out.println("系统中未找到该房屋信息...");
                    }
                    break;
                case 0:
                    break a;  // 跳出整个循环
                default:
                    System.out.println("您的输入有误,请重新输入...");
                    break;
            }
            System.out.println("请输入您要查找的房屋的方式：(1.按地址 2.按类型 3.按面积 0.退出）");
            number = scanner.nextInt();
        }
        System.out.println("已退出查找功能...");
        return;

    }
}
