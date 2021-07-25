import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution38_2 {
    public String[] permutation(String s) {
        List<String> res = new ArrayList<>();
        char[] arr = s.toCharArray();
        permutation(arr,0,res);
        return res.toArray(new String[0]);
    }

    private void permutation(char[] arr, int index, List<String> res) {
        if (index == arr.length){
            res.add(String.valueOf(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (!isExchange(arr,index,i)){
                // 没有交换过
                swap(arr,index,i);
                permutation(arr,index+1,res);
                swap(arr,index,i);
            }
        }
    }

    private void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private boolean isExchange(char[] arr, int start, int end) {
        if (start == end){
            return false;
        }

        for (int i = start; i < end; ++i){
            if (arr[i] == arr[end]){
                return true;
            }
        }
        return false;
    }

}
