//实现 int sqrt(int x) 函数。
//计算并返回 x 的平方根，其中 x 是非负整数。
//由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
public class test69 {
    public static void main(String[] args) {
        Solution69 s = new Solution69();
        System.out.println(s.mySqrt(2147395600));
    }
}

// 官方：
class Solution69 {
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}


/*
// 自己实现：
class Solution69 {
    public int mySqrt(int x) {
        for (long i = 1; i <= x; i++){
            if ( i * i <= x && (i + 1) * (i + 1) > x){
                return (int) i;
            }
        }
        return 0;
    }
}*/
