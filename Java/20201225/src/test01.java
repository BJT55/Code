import java.util.Arrays;

public class test01 {
    //类 和 对象 是面向对象程序设计中的核心概念






    /*
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        func(arr);   //相当于 arr[0] = 100;
        System.out.println(Arrays.toString(arr));
    }
    private static void func(int[] a) {
//        a[0] = 100;
        int[] b = {100,2,3,4,5};
        a = b;        //输出还是为原来的值{1,2,3,4,5}
    }
     */

/*
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        System.out.println(arr1 == arr2);   //返回 false
        arr1 = arr2;   //修改了arr1的地址 ， 指向arr2的地址 ， 垃圾回收机制将arr1原来的元素给释放
        System.out.println(arr1 == arr2);   //返回 true
    }
 */

        //null
        //空指针表示指针中村的地址对应的内存是一个非内存
        //空引用表示该引用里面所持有的地址对应的对象，是一个非法的对象
        //不能针对null这样的引用进行解引用
        //可以使用null来表示一个非法值
        //null不能赋值给int ，但可以赋值给 integer
    /*
        public static void main(String[] args) {
            int[] arr = new int[]{1,5,4,2};
            arr = null;
            System.out.println(arr.length);     //运行时会出现问题  “ NullPointerException(空指针异常) ..... ”

       }
     */

//        arr.length;

}
