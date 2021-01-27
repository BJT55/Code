package system.function;

import system.House;
import system.HouseList;
import java.util.*;

public class Add implements IFunction{
    @Override
    public void operate(HouseList houseList) {
        System.out.println("您已进入[ 增添 ]功能...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入新房屋的地址： ");
        String address = scanner.next();
        System.out.println("请输入新房屋的面积： ");
        double area = scanner.nextDouble();
        System.out.println("请输入新房屋的类型： ");
        String type = scanner.next();

        // 将新增房屋信息加入 HouseList 中
        House house = new House(address,area,type);
        int currentHouse = houseList.getCount(); // 获取当前房屋数量
        houseList.setHouse(currentHouse,house);
        houseList.setCount(currentHouse+1); // 房屋数量加一

        System.out.println("新增房屋添加完毕...");
    }
}
