public class Solution38 {
    public String countAndSay(int n) {
        String res = "1";
        for (int i = 2; i <= n; i++){
            StringBuilder tmp = new StringBuilder();
            for (int j = 0; j < res.length(); j++){
                int count = 1;
                while (j+1 < res.length() && res.charAt(j) == res.charAt(j+1)){
                    count++;
                    j++;
                }
                tmp.append(count).append(res.charAt(j));
            }
            res = tmp.toString();
        }
        return res;
    }
}
