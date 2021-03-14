public class test709 {
}

class Solution709 {
    public String toLowerCase(String str) {
        char[] c = str.toCharArray();
        for(int i = 0; i < c.length; ++i){
            if(c[i] <= 'Z' && c[i] >= 'A'){
                c[i] += 32;
            }
        }
        return new String(c);
    }
}