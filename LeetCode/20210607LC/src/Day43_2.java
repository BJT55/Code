import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Day43_2 {
    public static int n, m;
    public static ArrayList<ArrayList<Integer>> res = new ArrayList<>();;
    public static ArrayList<Integer> tmp = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            n = in.nextInt();
            m = in.nextInt();
            dfs(1,n,m);
            for (ArrayList<Integer> list : res){
                int i;
                for (i = 0; i < list.size()-1; ++i){
                    System.out.print(list.get(i) + " ");
                }
                System.out.println(list.get(i));
            }
        }
    }
    public static void dfs(int index, int n, int count){
        if (count == 0){
            res.add(new ArrayList<>(tmp));
        }else {
            for (int i = index; i <= count && i <= n; i++) {
                tmp.add(i);
                dfs(i+1,n,count-i);
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
