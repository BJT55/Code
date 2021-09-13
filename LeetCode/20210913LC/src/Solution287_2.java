public class Solution287_2 {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int left = 1, right = len-1, res = -1;
        while (left <= right){
            int mid = (left+right)>>1;
            int count = 0;
            for (int i = 0; i < len; i++) {
                if (nums[i] <= mid){
                    count++;
                }
            }
            if (count <= mid){
                left = mid+1;
            }else {
                right = mid-1;
                res = mid;
            }
        }
        return res;
    }
}
