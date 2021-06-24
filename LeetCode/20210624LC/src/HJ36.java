import java.util.*;
public class HJ36 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s1 = in.nextLine().toUpperCase();
            String s2 = in.nextLine();
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            LinkedHashSet<Character> set = new LinkedHashSet();
            for(char c : c1){
                set.add(c);
            }
            int m = 0;
            while(set.size() < 26){
                char c = (char)('A' + m);
                set.add(c);
                m++;
            }

            ArrayList<Character> list = new ArrayList<>(set);
            StringBuilder res = new StringBuilder();
            for(int i = 0; i < c2.length; ++i){
                if(c2[i] == ' '){
                    res.append(c2[i]);
                }else if(c2[i] < 'a'){
                    int n = (int)(c2[i] - 'A');
                    char c = list.get(n);
                    res.append(c);
                }else{
                    int n = (int)(c2[i] - 'a');
                    char c = (char)(list.get(n) + 'a' - 'A');
                    res.append(c);
                }
            }
            System.out.println(res.toString());
        }
    }
}
