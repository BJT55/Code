public class test11 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(func(arr,3));
    }

    public static int func(int[] arr,int num) throws ArrayIndexOutOfBoundsException{
        if (  num >= arr.length ){
            throw new ArrayIndexOutOfBoundsException("抛出数组下标越界异常");
        }
        return arr[num];
    }
}