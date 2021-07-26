public class Solution46_2 {
    public int translateNum(int num) {
        if (num < 9){
            return 1;
        }

        int tmp = num%100;
        if (tmp <= 9 || tmp >= 26){
            return translateNum(num/10);
        }
        else {
            return translateNum(num/10) + translateNum(num/100);
        }
    }

}
