import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1,4,3,6,8,2,7,9,3,4};
        Solution(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Solution(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++){
            for (int j = 0; j < arr.length / 2; j++) {
                if (arr[low] % 2 == 0) {
                    low++;
                }else {
                    break;
                }
            }
            for (int k = high - 1; k >= arr.length/2; k--){
                if (arr[high] % 2 == 1){
                    high--;
                }else {
                    break;
                }
            }
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
        }
    }
}

