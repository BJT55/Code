//给定一个已按照 升序排列  的整数数组 numbers ，
//请你从数组中找出两个数满足相加之和等于目标数 target 。
//函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。
//numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
//你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。

import java.util.Arrays;

public class test167 {
    public static void main(String[] args) {
        Solution167 s = new Solution167();
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(s.twoSum(numbers,target)));
    }
}


// 自己解：（双指针）
class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while(left < right){
            if (numbers[left] + numbers[right] > target){
                right--;
            }else if(numbers[left] + numbers[right] < target){
                left++;
            }else{
                return new int[]{left+1 , right+1};
            }
        }
        return new int[0];
    }
}

