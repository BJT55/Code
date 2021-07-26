public class Solution46 {
    public int translateNum(int num) {
        String str = String.valueOf(num);
        return dfs(str,0);
    }

    private int dfs(String str, int index) {
        if (index >= str.length()-1){
            return 1;
        }

        int res = dfs(str,index+1);
        String tmp = str.substring(index,index+2);
        if (tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0){
            res += dfs(str,index+2);
        }
        return res;
    }

}
