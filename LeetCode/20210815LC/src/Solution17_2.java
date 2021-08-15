public class Solution17_2 {
    StringBuilder res;
    int nine = 0, count = 0, start, n;
    char[] num, loop={'0','1','2','3','4','5','6','7','8','9'};
    public String printNumbers(int n) {
        this.n = n;
        res = new StringBuilder();
        num = new char[n];  // 定义长度为n的字符列表
        start = n-1;  // start左边为高位多余0, 右边为所需要的数
        dfs(0);
        res.deleteCharAt(res.length()-1); // 删除末尾多余的逗号
        return res.toString();
    }

    private void dfs(int x) {
        if (x == n){
            String s = String.valueOf(num).substring(start);
            if (!s.equals("0"))
                res.append(s + ",");
            if (n - start == nine)
                start--;
            return;
        }

        for (char i : loop){
            if (i == '9')
                nine++;
            num[x] = i;
            dfs(x+1);
        }
        nine--;
    }
}
