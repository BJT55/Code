import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// 乒乓球筐
public class Day45_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            String[] ss = s.split(" ");
            String A = ss[0];
            String B = ss[1];
            Map<Character,Integer> map = new HashMap<>();
            for (char c: A.toCharArray()) {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            for (char c: B.toCharArray()) {
                if (map.containsKey(c)){
                    int tmp = map.get(c);
                    if (tmp-1 < 0){
                        // 此时A盒中的c类乒乓球数量少于B盒中
                        System.out.println("No");
                        return;
                    }
                    map.put(c,tmp-1);
                }else {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}
