public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        int heapSize = nums.length;
        createHeap(nums);
        for (int i = 0; i < nums.length; i++){
            swap(nums,0,heapSize-1);
            heapSize--;
            shiftDown(nums,0,heapSize);
        }
        return nums[0];
    }

    private void shiftDown(int[] nums, int index, int heapSize) {
        int parent = index;
        int child = 2*index+1;
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

    private void createHeap(int[] nums) {
        for (int i = (nums.length-1)/2; i >= 0; i++){
            shiftDown(nums,i,nums.length);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
