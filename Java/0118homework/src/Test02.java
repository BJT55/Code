import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 7};
        int[] b = {3, 6, 7, 2, 0, 8};
        Exchange(a, b);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }

    private static void Exchange(int[] arr1, int[] arr2) {
        int tmp = 0;
        for (int i = 0; i < arr1.length; i++) {
            tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = tmp;
        }
    }
}
