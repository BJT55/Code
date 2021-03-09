public class test643 {
    public static void main(String[] args) {
        Solution643 s = new Solution643();
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(s.findMaxAverage(nums,4));
    }
}

/*
class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <= nums.length - k; ++i){
            int sum = 0;
            for(int j = i; j < i + k; ++j){
                sum += nums[j];
            }
            max = Math.max(max,sum);
        }
        return max*1.0/k;
    }
}*/


// 滑动窗口：
class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; ++i){
            sum += nums[i];
        }
        int max = sum;
        for (int i = k; i < nums.length; ++i){
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max,sum);
        }
        return 1.0*max / k;
    }
}