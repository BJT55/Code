package Practice_BookSystem;

import Practice_BookSystem.operation.IOperation;

//用来作为 管理者 和 普通用户 的父类
//存放两种角色的公共信息
//User 不应该被实例化，将其做成一个抽象类，防止后面不小心将其抽象化
abstract public class User {
    protected String name;
    protected IOperation[] operations;
    // 打印菜单（普通用户和管理员菜单不一样）
    public abstract int menu();

    public void doOperation(int choice, BookList bookList){
        IOperation operation = this.operations[choice - 1];
        operation.work(bookList);
    }
}
