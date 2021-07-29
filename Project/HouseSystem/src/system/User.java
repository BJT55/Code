package system;

import system.function.IFunction;
//User 为 售房用户 和 购房用户 的父类
abstract public class User {
    protected String name; // 用户名
    protected IFunction[] functions; // 用户可使用的功能

    public abstract int menu(); // 打印菜单

    // 根据选择用户类型执行各自功能
    public void doFunction(int choice, HouseList houseList){
        IFunction function = this.functions[choice - 1];
        function.operate(houseList);
    }
}
