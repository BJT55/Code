package Day08;

import java.util.Arrays;

// 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。最高位数字存放在数组的首位，
// 数组中每个元素只存储单个数字。(注意：你要防止的是第一个数字是9或者最后一个是9哈！这种情况会有进位滴)
public class test04 {
    public static void main(String[] args) {
        int[] digits = {1,4,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--){
            digits[i]++;
            digits[i] %= 10;
            // 当第 i 位 加 1 后未产生进位，则返回数组，
            // 否则循环至 i-1 位后加1，即向前进一位
            if (digits[i] != 0){
                return digits;
            }
        }
        // 当出现 999 的情况时，进一位变成 1000
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
