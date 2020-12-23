import java.util.Arrays;

public class test05 {
    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序
    public static void sort(int[] a , int n){
        int left = 0;
        int right = n - 1;
        while ( left < right){
            while ( left < right && a[left] % 2 != 0){
                left++;
            }
            while ( left < right && a[right] % 2 == 0){
                right--;
            }
            if (a[left] % 2 == 0 && a[right] % 2 != 0){
                int tmp = a[left];
                a[left] = a[right];
                a[right] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,5,34,88,23,76,45,62,11,22};
        int size = arr.length;
        sort(arr,size);
        System.out.println(Arrays.toString(arr));
    }
}
