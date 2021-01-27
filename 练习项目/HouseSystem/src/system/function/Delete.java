package system.function;

import system.HouseList;

import java.util.Scanner;

public class Delete implements IFunction{
    @Override
    public void operate(HouseList houseList) {
        System.out.println("您已进入[ 删除 ]功能...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的房屋的地址：（楼号-单元号-门牌号）");
        String address = scanner.next();

        // 遍历找到对应房屋
        int i = 0;
        for (; i < houseList.getCount(); i++){
            if (address.equals(houseList.getHouse(i).getAddress())){
                break;
            }
        }
        // 未找到对应房屋信息
        if (i == houseList.getCount()){
            System.out.println("对不起，未找到指定房屋信息，无法删除...");
            return;
        }
        // 找到对应房屋，进行删除
        if ( i == houseList.getCount() - 1){
            // 若删除的房屋信息在HouseList数组中的最后一个
            houseList.setCount(houseList.getCount() - 1);
            return;
        }else {
            // 删除的房屋信息在HouseList数组的非最后一个
            // 将最后一位复制到该位置，再删除最后一位
            houseList.setHouse(i,houseList.getHouse(houseList.getCount() - 1));
            houseList.setCount(houseList.getCount() - 1);
            System.out.println(address+" 房屋信息已被删除...");
            System.out.println("删除结束...");
        }
    }
}
