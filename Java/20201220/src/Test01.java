import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

    //java中的引用相当于把c的指针给限制了一部分功能

    //java中允许二维数组的每一行的长度不同

    /*
    public static void main(String[] args) {
        //交换首尾的 n 位数
        // 逆序 ！= 倒叙打印

        int[] arr = {11,61,45,32,73,8,4,23,6,56,89};
        reverse(arr,2);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[] arr, int n){
        int left = 0;
        int right = arr.length -1 ;
        int count = 0;
            while ( left < right ){
                if (count == n){
                    break;
                }else{
                    count++;
                }

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;

            }
        }
     */


     /*
    public static void main(String[] args) {

        //调用包来进行排序
        int[] arr = {11,61,45,32,73,8,4,23,6,56,89};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
     */


    /*
    public static void main(String[] args) {
        //冒泡排序（升序）： 依次比较相邻的两个元素
        //冒泡排序是一种比较低效的排序方式
        int[] arr = {11,61,45,32,73,8,4,23,6,56,89};
        bubbleSort(arr);
        printArray(arr);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = arr.length - 1; j > i; j--){
                if ( arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.printf(arr[i]+" ");
        }
    }

     */

/*
    public static void main(String[] args) {
        //二分查找     前提：数组有序
        int[] arr = { 2,3,6,7,9,10,12,43,78};
        Scanner scanner = new Scanner(System.in);
        int toSearch = scanner.nextInt();
        int pos = binarySearch(arr,toSearch);
        if ( pos != -1){
            System.out.println(toSearch+" 在数组中的下标为："+pos);
        }else{
            System.out.printf("该数组中未查到 "+toSearch+" 所在位置");
        }
    }
    //直接取整个数组的中间元素，拿中间元素和待查找元素进行对比
    private static int binarySearch(int[] arr, int toSearch) {
        //创建一个待查找的区间  [left,right]
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if ( toSearch < arr[mid]){
                right = mid - 1;   //淘汰右侧数值
            } else if( toSearch > arr[mid]){
                left = mid + 1;    //淘汰左侧数组
            }else {
                return mid;
            }
        }
        return -1;   //数组下标返回-1时表示未找到该数值
    }

 */

/*
    public static void main(String[] args) {
        //查找数组元素的位置(数组下标)
        int[] arr = {0,1,2,3,4,5,6};
        int pos = search(arr,3);
        System.out.print(pos);
    }
    public static int search(int[] arr, int toSearch){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == arr[toSearch-1]){
               return i;
            }
        }
        return -1;    //正常数组下标不为负数，所以返回负数时表示没有找到
    }
*/

    //垃圾回收器  ——>  面试必考（重点）
    //生命周期有俩级回收期啦进行管理的

/*
    public static void main(String[] args) {
        //数组拷贝2
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arrCopy = Arrays.copyOf(arr,arr.length);
        arr[0] = 99;
        System.out.println(arrCopy[0]);
    }
 */

/*
    public static void main(String[] args) {
        //数组拷贝1
        // 数组 = 不能代表拷贝 ，而只是给原先数组起了另一个名字，指向相同地址
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arrCopy = copyArray(arr);
        arr[3] = 64;
        arrCopy[3] = 99;
        System.out.printf("arr[3]"+"="+arr[3]+","+"arrCopy[3]"+"="+arrCopy[3]);
    }
    private static int[] copyArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            result[i] = arr[i];
        }
        return result;
    }
*/
        //把数组转换成String  (java.util.Arrays)
//        int[] arr = {1,2,3,4,5,6 };
//        String result = Arrays.toString(arr);
//        System.out.println(result);

        //依次打印出arr的数字
//        int[] arr = {1,2,3,4,5,6 };
//        for ( int x : arr){
//            System.out.print(x+",");
//        }


}
