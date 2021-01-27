package system.function;

import system.House;
import system.HouseList;

import java.util.Scanner;

public class Buy implements IFunction{
    @Override
    public void operate(HouseList houseList) {
        System.out.println("您已进入[ 购买 ]功能...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要购买的房屋地址：（楼号-单元号-门牌号）");
        String address = scanner.next();

        // 遍历找到所要购买房屋的地址
        int i = 0;
        for (; i < houseList.getCount(); i++){
            if (houseList.getHouse(i).getAddress().equals(address)){
                break;
            }
        }
        // 未找到相关房屋
        if (i == houseList.getCount()){
            System.out.println("系统中未找到 "+address+" 房屋信息，无法购买...");
            return;
        }
        // 找到相关房屋
        House buyHouse = houseList.getHouse(i);
        // 判断是否已被售出
        if (buyHouse.isState()){
            System.out.println("对不起，此房已被售出，无法购买...");
            return;
        }
        //未被售出
        houseList.getHouse(i).setState(true);//将房屋状态改为 已售出
        System.out.println("恭喜您，购房成功！");
        return;

    }
}
