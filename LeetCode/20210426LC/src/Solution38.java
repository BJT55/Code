class Solution38 {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        StringBuilder res = new StringBuilder();
        String tmp = countAndSay(n-1);
        int left = 0, right = 0;
        while (right < tmp.length()){
            if (tmp.charAt(left) != tmp.charAt(right)){
                res.append(right-left).append(tmp.charAt(left));
                left = right;
            }
            right++;
        }
        res.append(right-left).append(tmp.charAt(left));
        return res.toString();
    }
    public static String countAndSay_2(int n) {
        String tmp = "1";
        for (int i = 2; i <= n; ++i){
            StringBuilder res = new StringBuilder();
            for (int j = 0; j < tmp.length(); ++j){
                int count = 1;
                while (j+1 < tmp.length() && tmp.charAt(j+1) == tmp.charAt(j)){
                    count++;
                    j++;
                }
                res.append(count);
                res.append(tmp.charAt(j));
            }
            tmp = res.toString();
        }
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay_2(4));
    }
}