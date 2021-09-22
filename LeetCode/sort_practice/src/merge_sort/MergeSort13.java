package merge_sort;

public class MergeSort13 {
    public static void main(String[] args) {
        int[] nums = {72,3,54,66,12,32,89,23,44,90,0};
        mergeSort(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void mergeSort(int[] nums) {
        _mergeSort(nums,0,nums.length);
    }

    private static void _mergeSort(int[] nums, int i, int j) {
        if (j-i <= 1) return;

        int mid = (i+j)/2;
        _mergeSort(nums,i,mid);
        _mergeSort(nums,mid,j);
        merge(nums,i,mid,j);
    }

    private static void merge(int[] nums, int i, int mid, int j) {
        int[] tmp = new int[j-i];
        int index = 0;

        int left = i,right = mid;
        while (left < mid && right < j){
            if (nums[left] <= nums[right]){
                tmp[index++] = nums[left++];
            }else {
                tmp[index++] = nums[right++];
            }
        }
        while (left < mid){
            tmp[index++] = nums[left++];
        }
        while (right < j){
            tmp[index++] = nums[right++];
        }

        for (int k = 0; k < tmp.length; k++){
            nums[k+i] = tmp[k];
        }
    }

    /**
     *
     * 归并排序:分治法典型应用-->将每个子序列有序,再将已有序列进行合并,得到新的有序序列
     * 时间复杂度: O(nlog2n)
     * 空间复杂度: O(N)
     * 稳定
     */

}
