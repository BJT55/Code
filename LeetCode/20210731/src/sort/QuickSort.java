package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {2,3,1,7,9,5,8,4,6};
        quick(nums);
//        sort(nums,0,nums.length-1);
        for (int n : nums){
            System.out.print(n+" ");
        }
    }


    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void quick(int[] nums) {
//        _quick(nums,0,nums.length-1);
        _quick_2(nums,0,nums.length-1);
    }

    private static void _quick_2(int[] nums, int i, int j) {
        if (i >= j){
            return;
        }

        int left = i;
        int right = j;
        int tmp = nums[left];
        while (left < right){
            while (left < right && nums[right] >= tmp){
                right--;
            }
            nums[left] = nums[right];

            while (left < right && nums[left] < tmp){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = tmp;
        _quick_2(nums,i,left-1);
        _quick_2(nums,left+1,j);
    }

    private static void _quick(int[] nums, int i, int j) {
        if (i >= j){
            return;
        }

        int left = i;
        int right = j;

        int tmp = nums[left];
        while (left < right){
            while (left<right && nums[right] >= tmp){
                right--;
            }
            nums[left] = nums[right];
            while (left<right && nums[left] <= tmp){
                left++;
            }
            nums[right] = nums[left];

        }
        nums[left] = tmp;
        _quick(nums,i,left-1);
        _quick(nums,left+1,j);
    }


}
