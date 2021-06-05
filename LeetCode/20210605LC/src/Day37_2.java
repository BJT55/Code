import java.util.Arrays;
import java.util.Scanner;

public class Day37_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            String[] path = new String[n];
            for (int i = 0; i < n; ++i){
                path[i] = in.next();
            }

            Arrays.sort(path);

            // 将数组中相等的元素以及前一个是后一个子串的字符串剔除掉
            boolean[] flag = new boolean[n];  // 用来标记删除
            for (int i = 1; i < path.length; ++i){
                if ( path[i].equals(path[i-1]) || path[i].contains(path[i-1])
                        && path[i].charAt(path[i-1].length()) == '/'){
                    flag[i-1] = true;
                }
            }

            // 输出flag不为true的字符串
            for (int i = 0; i < n; ++i){
                if (!flag[i]){
                    System.out.println("mkdir - p " + path[i]);
                }
            }
            System.out.println();
        }
    }
}
