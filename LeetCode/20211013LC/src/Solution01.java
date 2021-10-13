import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            String[] ss = s.split("->");
            int[] num = new int[ss.length];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(ss[i]);
            }

            StringBuilder res = new StringBuilder();
            res.append(num[0]);
            boolean flag = true;
            for (int i = 1; i < num.length; i++){
                if (flag && i != num.length-1){
                    res.append("->");
                }
                if (num[i-1] != num[i]){
                    res.append(num[i]);
                    flag = true;
                }else {
                    flag = false;
                }
            }
            System.out.println(res.toString());
        }
    }
}
