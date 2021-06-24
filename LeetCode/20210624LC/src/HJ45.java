import java.util.*;
public class HJ45 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            String[] str = new String[n];
            for(int i = 0; i < n; ++i){
                str[i] = in.next();
            }

            for(String s : str){
                int[] count = new int[26];
                for(char c : s.toCharArray()){
                    if(Character.isUpperCase(c)){
                        count[c-'A']++;
                    }else if(Character.isLowerCase(c)){
                        count[c-'a']++;
                    }
                }
                Arrays.sort(count);
                int tmp = 26;
                int res = 0;
                for(int i = count.length-1; i >= 0; --i){
                    res += count[i]*tmp;
                    if(count[i] != 0){
                        tmp--;
                    }
                }
                System.out.println(res);
            }
        }
    }
}
