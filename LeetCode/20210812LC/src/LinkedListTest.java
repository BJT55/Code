import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
//        list.addFirst(1);;
//        list.addFirst(2);
//        list.addLast(3);
        list.pollFirst();
        for (Integer entry : list){
            System.out.print(entry+" ");
        }

    }
}
