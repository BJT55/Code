package system.function;

import system.HouseList;

public class End implements IFunction{
    @Override
    public void operate(HouseList houseList) {
        System.out.println("退出系统成功...");
        System.exit(0);
    }
}
