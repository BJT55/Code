package sort;

public class HeapSort {
    public static void main(String[] args) {
        int[] nums = {2,3,1,7,9,5,8,4,6,13,15,15,19,43,41,93,52};
        heapSort(nums);
        for (int n : nums){
            System.out.print(n+" ");
        }
    }

    private static void heapSort(int[] nums) {
        createHeap(nums);  //建堆
        int heapSize = nums.length;

        for (int i = 0; i < nums.length; i++){
            swap(nums,0,heapSize-1);
            heapSize--;
            shiftHeapSort(nums,heapSize,0);  // 向下调整
        }
    }

    private static void createHeap(int[] nums) {
        for (int i = (nums.length-1)/2; i >= 0; --i){
            shiftHeapSort(nums,nums.length,i);
        }
    }

    private static void shiftHeapSort(int[] nums, int size, int index) {
        int parent = index;
        int child = 2*index+1;
        while (child < size){
            // 找到左右子树较大的
            if (child+1 < size && nums[child+1] > nums[child]){
                child += 1;
            }
            if (nums[parent] < nums[child]){
                swap(nums,parent,child);
            }
            else {
                break;
            }
            parent = child;
            child = 2*parent+1;
        }
    }


    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
