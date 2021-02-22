public class test405 {
}

class Solution405 {
    public String toHex(int num) {
        if(num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        char[] c = {'0','1','2','3','4','5','6','7','8','9',
                'a','b','c','d','e','f'};
        while(sb.length() < 8 && num != 0){
            sb.append(c[num&0xf]);
            num >>= 4;
        }
        return sb.reverse().toString();
    }
}