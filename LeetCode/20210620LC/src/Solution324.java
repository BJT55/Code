import java.util.Arrays;

class Solution324 {
    public void wiggleSort(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int[] tmp = new int[len];
        int i = 0, j = len-1, index = 0;
        while (i < j){
            tmp[index++] = nums[i++];
            tmp[index++] = nums[j--];
        }
        for (int k = 0; k < len; k++) {
            nums[k] = tmp[k];
        }
        return;
    }
}