import java.util.*;

public class Day37_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            Stack<String> stack = new Stack<>();
            int n = in.nextInt();
            in.nextLine();
            String[] ss = new String[n];
            for (int i = 0; i < n; ++i){
                String s = in.nextLine();
                if (i != 0) {
                    for (int j = 0; j < i; ++j) {
                        if (s.contains(ss[j])) {
                            ss[j] = s;
                        }
                    }
                }
                ss[i] = s;
            }
            Set<String> set = new HashSet<>();
            for (String p : ss){
                set.add(p);
            }
            List<String> list = new ArrayList<>(set);
            Arrays.sort(list.toArray());
            for (int i = 0; i < list.size(); ++i){
                System.out.println("mkdir -p " + list.get(i));
            }
            System.out.println();
        }
    }
}
