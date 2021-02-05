// 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
// 每次你可以爬 1 或 2 个台阶。
// 你有多少种不同的方法可以爬到楼顶呢？
public class test70 {
    public static void main(String[] args) {
        Solution70 s = new Solution70();
        System.out.println(s.climbStairs(5));
    }
}

// 官方：
// 递归：存储重甲结果，避免重复计算
/*
class Solution70 {
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        return climbStairs(n,memo);
    }
    public int climbStairs(int n, int memo[]) {
        if (memo[n] > 0){
            return memo[n];
        }
        if (n == 1){
            memo[n] = 1;
        }else if (n == 2){
            memo[n] = 2;
        }else {
            return memo[n] = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);
        }
        return memo[n];
    }
}
*/

//官方：
//动态规划：
class Solution70 {
    public int climbStairs(int n) {
        if (n == 1){
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}