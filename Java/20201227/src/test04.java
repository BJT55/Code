public class test04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printArray(arr);
    }
    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
