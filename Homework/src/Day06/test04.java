package Day06;
// 4、给定一个按非递减顺序排序的整数数组 A ，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
import java.util.Arrays;

public class test04 {
    public static void main(String[] args) {
        int[] A = {-5,-2,-1,0,3,5,7};
        sortedSquares(A);
        System.out.println(Arrays.toString(A));
    }

    public static int[] sortedSquares(int[] A){
        for (int i = 0; i < A.length; i++){
            if ( A[i] < 0 ){
                A[i] *= -1;
            }
        }
        Arrays.sort(A);
        for (int j = 0; j < A.length; j++){
            A[j] *= A[j];
        }
        return A;
    }
}
