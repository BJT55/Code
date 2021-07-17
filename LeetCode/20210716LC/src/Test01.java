import java.util.LinkedList;

public class Test01 {
    public int[] getMaxWindow(int[] arr, int w){
        if (arr == null || arr.length < w ){
            return null;
        }

        LinkedList<Integer> list = new LinkedList<>();
        int[] res = new int[arr.length-w+1];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            while ( !list.isEmpty() && arr[list.peekLast()] <= arr[i]){
                list.pollLast();
            }
            list.addLast(i);
            if (list.peekFirst() == i-w){
                list.pollFirst();
            }
            if (i >= w-1){
                res[index++] = arr[list.peekFirst()];
            }
        }
        return res;
    }
}
