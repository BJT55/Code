public class test476 {
    public static void main(String[] args) {
        Solution476 s = new Solution476();
        int num = 16;
        System.out.println(s.findComplement(num));
    }
}

class Solution476 {
    public int findComplement(int num) {
        int ret = 0;
        int count = 0;  // 2的次方数
        while(num > 0){
            int tmp = num&1;  // 求num末尾的数
            if(tmp == 0){  // 为0时，求补数为1
                ret = (int) (ret + Math.pow(2,count));
            }
            count++;
            num >>= 1;
        }
        return ret;
    }
}