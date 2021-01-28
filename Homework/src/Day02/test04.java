package Day02;
import java.util.Arrays;
//给定一个数组 nums 和一个值 val ，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
//不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成
public class test04 {
    public static void main(String[] args) {
        int[] arr = {1,5,2,6,2,2,5,2,9,3};
        Solution sl = new Solution();
        System.out.println(sl.removeElement(arr,2));
        System.out.println(Arrays.toString(arr));
    }
    public static class Solution {
        public int removeElement(int[] nums, int val){
            int count = nums.length;
            for (int i = 0; i < count; i++){
                if (nums[i] == val){
                    count--;
                    for (int j = i; j < count; j++){
                        nums[j] = nums[j+1];
                    }
                    nums[count] = 0;
                    i--;
                }
            }
            return count;
        }
    }

}


