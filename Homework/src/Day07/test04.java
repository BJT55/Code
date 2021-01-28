package Day07;

import java.util.Arrays;
import java.util.Stack;

// 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
//你可以返回满足此条件的任何数组作为答案。
public class test04 {
    public static void main(String[] args) {
        int[] A = {2,1,4,6,7};
        System.out.println(Arrays.toString(sortArrayByParity(A)));
    }

    public static int[] sortArrayByParity(int[] A){
        int[] num = new int[A.length];
        int index = 0;
        for (int i = 0; i < A.length; i++){
            if ( A[i] % 2 == 0 ){
                num[index++] = A[i];
            }
        }
        for (int i = 0; i < A.length; i++){
            if ( A[i] % 2 != 0 ){
                num[index++] = A[i];
            }
        }
        return num;
    }


}
