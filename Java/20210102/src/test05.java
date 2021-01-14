public class test05 {
    public static void main(String[] args) {
        int[] arr = {1,5,8,4,2,8,9,10};
        System.out.println(my_toString(arr));
    }
     public static String my_toString(int[] arr){
        String str = "[";
        for(int i = 0; i < arr.length; i++){
            if (i != arr.length - 1) {
                str = str + arr[i] + ",";
            }else {
                str += arr[i];
            }
        }
        str += "]";
        return str;
     }
}
