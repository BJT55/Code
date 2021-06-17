import java.util.Scanner;
// 骆驼命名法
public class Day44_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            StringBuilder res = new StringBuilder();
            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '_'){
                    continue;
                }else if (i > 0 && arr[i-1] == '_'){
                    res.append(Character.toUpperCase(arr[i]));
                }else {
                    res.append(arr[i]);
                }
            }
            System.out.println(res.toString());
        }
    }
}
