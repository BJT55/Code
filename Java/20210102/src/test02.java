public class test02 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {2,3,6,7,8,9,1};
        order(arr1);
        order(arr2);
    }

    private static int order(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i+1]){
                System.out.println("该数组无序...");
                return 0;
            }
        }
        System.out.println("该数组有序...");
        return 1;
    }
}
