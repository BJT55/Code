import java.util.*;

public class SortTest {
    public static void main(String[] args) {
//        TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//
//        set.add(5);
//        set.add(1);
//        set.add(7);
//        set.add(3);
//        set.add(9);
//        for (Integer entry : set){
//            System.out.print(entry +" ");
//        }

//        TreeMap<Integer, Integer> map = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        });
//
//        Queue<Integer> queue = new LinkedList<>();
//

        TreeSet<ListNode> set = new TreeSet<ListNode>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return 0;
            }
        });
    }
}

class ListNode implements Comparable{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
