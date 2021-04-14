import java.util.HashMap;
import java.util.Map;

public class Solution {
/*    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int n : array){
            map.put(n, map.getOrDefault(n,0)+1);
            if(map.get(n) >= array.length/2){
                return n;
            }
        }
        return 0;
    }*/

    public static int MoreThanHalfNum_Solution(int [] array) {
        int max = 0,tmp = 0;
        int res = 0;
        for (int i = 0; i < array.length; ++i){
            for (int j = i+1; j < array.length; ++j){
                if (array[j] == array[i]){
                    tmp++;
                }
            }
            if (tmp > max){
                res = array[i];
                max = tmp;
            }
            tmp = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(array));
    }
}