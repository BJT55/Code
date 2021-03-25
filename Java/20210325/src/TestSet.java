import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // 插入
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        // 判断是否存在
        boolean ret = set.contains(5);
        System.out.println(ret);
        // 删除
        set.remove(1);
        System.out.println(set);
        // 遍历：迭代器
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
