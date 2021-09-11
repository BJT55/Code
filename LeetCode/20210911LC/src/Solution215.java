public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        int heapSize = nums.length;
        buildHeap(nums,heapSize);
        for (int i = nums.length-1; i >= nums.length-k+1; --i){
            swap(nums,0,i);
            --heapSize;
            maxHeap(nums,0,heapSize);
        }
        return nums[0];
    }

    private void maxHeap(int[] nums, int i, int heapSize) {
        int left = i*2+1, right = i*2+2, largest = i;
        if (left < heapSize && nums[left] > nums[largest]){
            largest = left;
        }
        if (right < heapSize && nums[right] > nums[largest]){
            largest = right;
        }

        if (largest != i){
            swap(nums,i,largest);
            maxHeap(nums,largest,heapSize);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void buildHeap(int[] nums, int heapSize) {
        for (int i = heapSize/2; i >= 0; --i){
            maxHeap(nums,i,heapSize);
        }
    }

}
