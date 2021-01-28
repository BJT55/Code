package Day12;
// 581
//给你一个整数数组 nums,你需要找出一个连续子数组,
//如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
//请你找出符合题意的最短子数组，并输出它的长度。
public class test04 {
    public static void main(String[] args) {
        int[] nums = {2,3,3,2,4};
        System.out.println(findUnsortedSubarray(nums));
    }

    public static int findUnsortedSubarray(int[] nums){
        int left = nums.length;
        int right = 0;
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] < nums[i]){
                    right = Math.max(right,j);
                    left = Math.min(left,i);
                }
            }
        }
        return right - left < 0 ? 0 : right - left + 1;
    }
}
