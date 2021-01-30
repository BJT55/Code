package Practice_BookSystem.operation;

import Practice_BookSystem.BookList;

//退出程序
public class Exit implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出程序...");
       // 通过这里的 exit 方法就可以直接结束当前程序
        System.exit(0);
    }
}
