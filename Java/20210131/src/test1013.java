//给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
//形式上，如果可以找出索引 i+1 < j 且满足 
//A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1] 就可以将数组三等分。

public class test1013 {
    public static void main(String[] args) {
        Solution1013 s = new Solution1013();
        int[] arr = {3,3,6,5,1,3,-3,1,3,-9,4,1};
        System.out.println(s.canThreePartsEqualSum(arr));
    }
}

class Solution1013 {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        if (sum % 3 != 0){
            return false;
        }
        int currentSum = 0, count = 0;
        sum /= 3;
        for (int i = 0; i < arr.length; i++){
            currentSum += arr[i];
            if (currentSum == sum ){
                count++;
                currentSum = 0;
                if (count == 3){
                    return true;
                }
            }
        }
    return false;
    }
}