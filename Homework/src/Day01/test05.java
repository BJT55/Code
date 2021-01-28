package Day01;
import java.util.Arrays;
//给定一个数组，将数组中的元素向右移动k个位置
public class test05 {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,4,6};
        Solution sl = new Solution();
        sl.rotate(arr,8);
        System.out.println(Arrays.toString(arr));
    }

    static class Solution{
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            if (k > n ){
                k %= n;
            }
            for (int i = 0; i < k; i++){
                int temp = nums[n-1];
                for (int j = n-2; j >= 0; j--){
                    nums[j+1] = nums[j];
                }
                nums[0] = temp;
            }
        }
    }
}
