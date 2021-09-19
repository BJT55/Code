public class Solution367 {
    public boolean isPerfectSquare(int num) {
        int left = 1, right = num;
        while (left <= right){
            int mid = left+(right-left)/2;
            int tmp = num/mid;
            if (tmp == mid){
                if (num%mid == 0) return true;
                left = mid+1;
            }else if (tmp < mid){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return false;
    }

    public boolean isPerfectSquare_2(int num) {
        for (int i = 1; i*i <= num; i++){
            if (i*i == num){
                return true;
            }
        }
        return false;
    }


}
