package Test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        // 以顺序表，链表为例
//        // 这也是向上转型的写法
//        List<String> list1 = new ArrayList<>(); //链表
//        ArrayList<String> list2 = new ArrayList<>(); //顺序表
//
//        // 如果光看这一句 add 的代码 是不需要知道当前的list究竟是顺序表还是链表的
//        list1.add("hello");
//
        // 向上转型
        Animal animal = new Cat();
        // 向下转型 ,必须要确保animal指向的却是是一个 cat 类型的实例
        // 才可以进行转化 否则这样转化可能会失败
        Cat cat = (Cat) animal;
    }
}
