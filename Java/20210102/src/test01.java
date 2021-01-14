public class test01 {
    public static void main(String[] args) {
        int[] arr = {1,5,8,4,2,8,9,10};
        sort(arr);
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int[] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length - 1 - i; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
