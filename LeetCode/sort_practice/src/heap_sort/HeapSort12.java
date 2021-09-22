package heap_sort;

public class HeapSort12 {
    public static void main(String[] args) {
        int[] nums = {100,3,54,66,12,32,89,23,44,90};
        heapSort(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void heapSort(int[] nums) {
        createHeap(nums);
        int heapSize = nums.length;
        for (int i = 0; i < nums.length; i++) {
            swap(nums,0,heapSize-1);
            heapSize--;
            shifDown(nums,0,heapSize);
        }
    }

    private static void shifDown(int[] nums, int index, int heapSize) {
        int parent = index;
        int child = 2*parent+1;
        while (child < heapSize){
            if (child+1 < heapSize && nums[child] < nums[child+1]){
                child += 1;
            }

            if (nums[parent] < nums[child]){
                swap(nums,parent,child);
            }else {
                break;
            }

            parent = child;
            child = 2*parent+1;
        }
    }

    private static void createHeap(int[] nums) {
        for (int i = (nums.length-1)/2; i >= 0; i--){
            shifDown(nums,i,nums.length);
        }
    }


    /**
     *
     * 堆排序: 基本原理选择排序-->建立大顶堆升序排序 /小顶堆降序排序,
     *        交换堆顶和最后一个元素, 堆长-1,
     *        重复向下调整,直到排序完成
     *
     * 时间复杂度: O(nlog2n)
     * 空间复杂度: O(1)
     * 不稳定
     */

    private static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
