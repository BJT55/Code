
public class Solution05JZ {
    public String replaceSpace(String s) {
        char[] original = s.toCharArray();
        int n = original.length;
        int m = 0;
        for(char c : original){
            if(c == ' ')
                m++;
        }
        char[] ss = new char[m*2 + n];
        int j = ss.length - 1;
        for(int i = n-1; i >= 0; --i){
            if(original[i] != ' '){
                ss[j] = original[i];
                --j;
            }else{
                ss[j] = '0';
                ss[j-1] = '2';
                ss[j-2] = '%';
                j -= 3;
            }
        }
        return String.valueOf(ss);
    }
}
