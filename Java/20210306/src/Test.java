import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 顺序表
        List<String> list = new ArrayList<>();
        // 链表
        List<String> linkedList = new LinkedList<>();

        // 1.插入元素
        // add 是进行尾插
        linkedList.add("Java");
        // 中间位置插入
        linkedList.add(2,"C++");

        // 2.删除元素
        linkedList.remove("Java");
        linkedList.remove(2);

        // 3.查找元素
        // 无论是给定下标找值，还是给定值找下标,都需要进行链表的遍历
        linkedList.indexOf("C++");
        linkedList.get(2);

        // 4.修改元素
        linkedList.set(2,"Python");


    }
}
