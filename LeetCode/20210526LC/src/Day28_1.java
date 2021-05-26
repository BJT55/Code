public class Day28_1 {
    public void oddInOddEvenInEven(int[] arr) {
        int i = 0, j = 1;
        while (i < arr.length && j < arr.length){
            if (arr[arr.length-1]%2 == 0){
                swap(arr,arr.length-1,i);
                i += 2;
            }else {
                swap(arr,arr.length-1,j);
                j += 2;
            }
        }
    }
    public static void  swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
