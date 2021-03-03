public class test551 {
    public static void main(String[] args) {
        Solution551 sl = new Solution551();
        String s = "PPALLL";
        System.out.println(sl.checkRecord(s));
    }
}


class Solution551 {
    public boolean checkRecord(String s) {
        int countA = 0, countL = 0;
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; ++i){
            if(c[i] == 'A') countA++;
            if(countA > 1 ) return false;
            if(c[i] == 'L') countL++;
            else countL = 0;
            if(countL > 2) return false;
        }
        return true;
    }
}