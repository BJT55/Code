public class test01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(avg(arr));
    }

    public static double avg(int[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum / a.length;
    }
}
