import java.util.Arrays;

class Solution179 {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        Integer[] numArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            numArr[i] = nums[i];
        }

        Arrays.sort(numArr,(x,y)->{
            long xx = 10, yy = 10;
            while (xx <= x){
                xx *= 10;
            }
            while (yy <= y){
                yy *= 10;
            }
            return (int)(-yy * x - y + xx * y + x);
        });

        if (numArr[0] == 0){
            return "0";
        }
        StringBuilder res = new StringBuilder();
        for (int num : numArr) {
            res.append(num);
        }
        return res.toString();
    }
}