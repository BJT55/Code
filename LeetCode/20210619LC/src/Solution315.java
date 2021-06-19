import java.util.ArrayList;
import java.util.List;

class Solution315 {
    private int[] index;
    private int[] temp;
    private int[] tempIndex;
    private int[] ans;

    public List<Integer> countSmaller(int[] nums) {
        int len = nums.length;
        this.index = new int[len];
        this.temp = new int[len];
        this.tempIndex = new int[len];
        this.ans = new int[len];
        for (int i = 0; i < len; i++) {
            index[i] = i;
        }
        int left = 0, right = len-1;
        mergeSort(nums,left,right);
        List<Integer> list = new ArrayList<>();
        for (int num: ans) {
            list.add(num);
        }
        return list;
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left >= right){
            return;
        }

        int mid = (left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1, p = left;
        while (i <= mid && j <= right){
            if (arr[i] <= arr[j]){
                temp[p] = arr[i];
                tempIndex[p] = index[i];
                ans[index[i]] += (j-mid-1);
                ++i;
                ++p;
            }else {
                temp[p] = arr[j];
                tempIndex[p] = index[j];
                ++j;
                ++p;
            }
        }
        while (i <= mid){
            temp[p] = arr[i];
            tempIndex[p] = index[i];
            ans[index[i]] += (j-mid-1);
            ++i;
            ++p;
        }
        while (j <= right){
            temp[p] = arr[j];
            tempIndex[p] = index[j];
            ++j;
            ++p;
        }
        for (int k = left; k <= right ; k++) {
            index[k] = tempIndex[k];
            arr[k] = temp[k];
        }
    }

}