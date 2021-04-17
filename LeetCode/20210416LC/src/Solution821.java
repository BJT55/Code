class Solution821 {
    public int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        int index = 0;
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == c){
                res[index++] = 0;
                continue;
            }
            int j = 0,count = Integer.MAX_VALUE;
            while(j < s.length()){
                if(s.charAt(j) == c){
                    count = Math.min(count, Math.abs(j-i));
                }
                j++;
            }
            res[index++] = count;
        }
        return res;
    }
}