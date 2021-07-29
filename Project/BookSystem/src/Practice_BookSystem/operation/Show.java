package Practice_BookSystem.operation;

import Practice_BookSystem.BookList;

//浏览
public class Show implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("您已进入浏览模块...");
        for (int i = 0; i < bookList.getSize(); i++){
            System.out.println(bookList.getBook(i));
        }
    }
}
