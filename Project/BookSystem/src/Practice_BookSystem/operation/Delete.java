package Practice_BookSystem.operation;

import Practice_BookSystem.BookList;

import java.util.Scanner;

//删除书的信息
public class Delete implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("您已进入删除模块...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的书籍名称：");
        String name  = scanner.next();

        // 查找系统中是否有对应的书籍
        int i = 0;
        for (; i < bookList.getSize(); i++){
            if (name.equals(bookList.getBook(i).getName())){
                break;
            }
        }
        // 未找到匹配书籍名称
        if ( i >= bookList.getSize()){
            System.out.println("系统未找到书籍名称为《"+name+"》的书籍...");
        }

        // 找到匹配的书籍
        if ( i == bookList.getSize() - 1){
            // 如果当前要删除的元素刚好是数组的最后一个元素
            bookList.setSize(bookList.getSize() - 1);
            return;
        }
        // 如果是中间元素要删除
        // 先把最后一个元素赋值到要删除元素的位置
        // 再删除最后一个元素
        bookList.setBook(i,bookList.getBook(bookList.getSize() - 1));
        bookList.setSize(bookList.getSize() - 1);
        System.out.println("删除完毕...");
    }
}
