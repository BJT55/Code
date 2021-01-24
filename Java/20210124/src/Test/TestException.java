package Test;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        System.out.println(a / b); //ArithmeticException

/*

        try{
            System.out.println("try 之前的代码");
            int[] a = null;
            System.out.println(a[0]);
            System.out.println("try 之后的代码");
        }catch (NullPointerException e){
            System.out.println("catch 中的代码 ");
            System.out.println(" e 中的信息");
            // 这个方法能够打赢当前出现一次的代码对应的调用栈信息
            e.printStackTrace();
        }finally {
            // finally 中的逻辑无论前面的代码是否触发，都会执行到
            System.out.println("finally");
        }
        System.out.println("hello");
*/

/*        // 此时当 try catch 代码块执行完毕后，就会自动针对 Scanner 进行关闭
        try (Scanner scanner = new Scanner(System.in)){
            // 使用 Scanner 来进行若干操作
        } catch (NullPointerException e){
            System.out.println("空指针异常");
        }*/



        // 异常就会沿着调用栈，向上传递
        try {
            func1();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("异常");
        }

    }

    public static void func1(){
//        try {
            func2();
//        }catch (ArrayIndexOutOfBoundsException e ){
//            System.out.println("异常");
//        }

    }

    public static void func2(){
//        try{
            int[] a = {1,2,3};
            System.out.println(a[3]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("异常");
//        }
    }
}
