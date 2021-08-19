

public class Solution88 {
    public int findKth(int[] a, int n, int K) {
        // write code here
        quick(a,0,n-1);
        return a[K-1];
    }

    private void quick(int[] a, int i, int j) {
        if (i >= j) return;

        int left = i, right = j;
        int bound = a[left];
        while (left < right){
            while (left < right && a[right] < bound){
                right--;
            }
            a[left] = a[right];
            while (left < right && a[left] > bound){
                left++;
            }
            a[right] = a[left];
        }
        a[left] = bound;

        quick(a,i,left-1);
        quick(a,left+1,j);
    }
}
