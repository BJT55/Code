package thread;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Integer[] num = {1, 2, 3, 4};
        Arrays.sort(num, new Comparator<Integer>() {
            @Override
            public int compare (Integer o1, Integer o2){
                return o2 - o1;
            }
        });
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
