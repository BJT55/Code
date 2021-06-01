import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day35_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String names = in.nextLine();
            int i = 0;
            int end = 0;
            Set<String> set = new HashSet<>();
            while (i < names.length()){
                if ('\"' == names.charAt(i)){
                    end = names.indexOf('\"',i+1);
                    set.add(names.substring(i+1,end));
                    i = end + 2;
                }else {
                    end = names.indexOf(',',i+1);
                    if (-1 == end){
                        // 已经到达最后一个人名
                        set.add(names.substring(i));
                        break;
                    }
                    set.add(names.substring(i,end));
                    i = end + 1;
                }

                names = in.nextLine();
                if (set.contains(names)){
                    System.out.println("Ignore");
                }else {
                    System.out.println("Important!");
                }
            }
        }
    }
}
