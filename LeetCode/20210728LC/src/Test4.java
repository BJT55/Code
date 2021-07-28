public class Test4 {
    public void quickSort(int[] nums,int low, int high){
        int i = low;
        int j = high;
        int v = nums[i];

        while (i < j){
            while (i < j && nums[j] >= v){
                j--;
            }
            nums[i] = nums[j];
            while (i < j && nums[i] <= v){
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = v;
        quickSort(nums,low,j-1);
        quickSort(nums,j+1,high);
    }
}
