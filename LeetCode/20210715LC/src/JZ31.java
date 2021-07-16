public class JZ31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int res = 0;
        for(int i = 1; i <= n; i*=10){
            int high = n/i;
            int low = n%i;
            if(high%10 == 0){
                res += high/10 * i;
            }else if(high%10 == 1){
                res += (high/10 * i) + (low+1);
            }else{
                res += (high/10 + 1) * i;
            }
        }
        return res;
    }
}
