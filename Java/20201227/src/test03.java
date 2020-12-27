import java.util.Arrays;

public class test03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("原始的数组："+Arrays.toString(arr));
        transform(arr);
        System.out.println("改变后的数组"+Arrays.toString(arr));
    }

    public static void transform(int[] a){
        for (int i = 0; i < a.length; i++){
            a[i] *= 2;
        }
    }
}
