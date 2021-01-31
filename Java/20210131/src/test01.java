import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test01 {
    public static void main(String[] args) {
        // 1.创建 ArrayList 实例
        ArrayList<String> arrayList = new ArrayList<>();
//        System.out.println(arrayList.size()); // 0
//        System.out.println(arrayList.isEmpty()); // true

        // 2.给 ArrayList 中添加一些元素
        // add 一个参数的版本，是吧元素添加到顺序表末尾
        arrayList.add("C++");
        arrayList.add("PHP");
        arrayList.add("Python");
//        System.out.println(arrayList.size()); // 2
//        System.out.println(arrayList.isEmpty()); // false
//        System.out.println("尾插入结果："+arrayList);
        // add 的两个参数版本， 是把元素添加到指定的位置上
        arrayList.add(1,"Java SE");
        arrayList.add(0,"JavaScript");
//        System.out.println(arrayList.size());
//        System.out.println("中间插入依次的结果："+arrayList);


/*        // 3.删除元素
        //  按位置删除：
        System.out.println("删除前："+arrayList);
        arrayList.remove(2);
        System.out.println("删除后："+arrayList);
        //  按照值来删除：
        System.out.println("删除前："+arrayList);
        arrayList.remove("Hello ");
        System.out.println("删除后："+arrayList);*/


        // 倘若List内容为数字，则删除按位置删除还是按内容删除
/*        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("删除前："+list);
        list.remove(2);
        System.out.println("删除后："+list);
        // 若要删除数字，则用 Integer.valueOf() 来进行删除
        list.remove(Integer.valueOf(1));
        System.out.println("删除后："+list);*/


/*        // 4. 查找
        boolean ret = arrayList.contains("Java SE");
        System.out.println("查找 Java 的结果为：" + ret);

        // 返回 -1 代表未查到  （下标不存在为-1的元素）
        int index = arrayList.indexOf("Hell");
        System.out.println("查找 Hell 的位置为：" + index);*/

/*        // 5. 获取元素/修改元素
        String elem = arrayList.get(0);
        System.out.println("0 号元素为：" + elem);
        System.out.println("修改前的元素：" + arrayList);
        arrayList.set(0,"C#");
        System.out.println("修改后的元素：" + arrayList);*/

        // 6. 遍历操作
        // a)通过下标来进行遍历
        System.out.println("通过下标来进行遍历:");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        // b)通过迭代器进行遍历
        // 先通过 iterator 方法获取到迭代器对象
        // 再通过 while 循环来进行遍历
        System.out.println("\n通过迭代器进行遍历:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String e = iterator.next();
            System.out.println(e);
        }

        // c)通过 for-each 来遍历(本质上基于迭代器的方式来实现的)
        System.out.println("\n通过 for-each 来遍历:");
        for (String elem : arrayList){
            System.out.println(elem);
        }


    }
}
