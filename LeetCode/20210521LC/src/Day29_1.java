import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day29_1 {
    public static void main(String[] args) {
        int[] arr = {8,10,2,10,4,8,6,3,5,7,10};
        System.out.println(getFirstUnFormedNum(arr));
    }
    public static int getFirstUnFormedNum(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int min = arr[0],max = 0;

        for (int num : arr){
            max += num;
        }
//        if ((arr[0]+arr[len-1])*len/2 == max){
//            // 如果数组是按升序排列(即1,2,3...),则最小不可组成的和为 max + 1;
//            return max + 1;
//        }

        // 将所有和可能出现的数放入 Set 中
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; ++i){
            int tmp = arr[i];
            set.add(tmp);
            for (int j = i+1; j < len; ++j){
                tmp += arr[j];
                set.add(tmp);
            }
        }

        for (int i = min; i <= max; ++i){
            if (!set.contains(i)){
                return i;
            }
        }
        return max+1;
    }
}
