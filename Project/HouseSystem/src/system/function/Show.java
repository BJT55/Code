package system.function;

import system.HouseList;

public class Show implements IFunction{
    @Override
    public void operate(HouseList houseList) {
        System.out.println("您已进入[ 浏览 ]功能...");

        for (int i = 0; i < houseList.getCount(); i++){
            System.out.println(houseList.getHouse(i));
        }
    }
}
