public class Day28_1 {
    /**
     *	奇数位上都是奇数或者偶数位上都是偶数
     *	输入：数组arr，长度大于2
     *	将arr调整成奇数位上都是奇数或者偶数位上都是偶数
     */
    public void oddInOddEvenInEven(int[] arr) {
        int i = 0, j = 1;
        int len = arr.length;
        while (i < len && j < len){
            if (arr[len-1] % 2 == 0){
                swap(len-1,i,arr);
                i += 2;
            }else {
                swap(len-1,j,arr);
                j += 2;
            }
        }
    }
    public void swap(int i, int j, int[] arr){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}