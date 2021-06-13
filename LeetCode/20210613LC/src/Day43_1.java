import java.util.*;

public class Day43_1 {
    public static String[] number = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "22233344455566677778889999"};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            Set<String> set = new TreeSet<>();
            for (int i = 0; i < n; ++i){
                String s = in.next();
                char[] c = s.replace("-","").toCharArray();
                StringBuilder res = new StringBuilder();
                for (int j = 0; j < c.length; ++j){
                    // 当有三个数字时,加入 '-'
                    if (j == 3){
                        res.append('-');
                    }
                    // 如果该字符是数字, 则直接添入
                    if (Character.isDigit(c[j])){
                        res.append(c[j]);
                    }else {
                        // 将字母对应的数字添入
                        for (int k = 0; k < 26; k++) {
                            if (number[0].charAt(k) == c[j]){
                                res.append(number[1].charAt(k));
                                break;
                            }
                        }
                    }
                    // 当电话号码已经有 8 位 (7位字母+ 1位符号'-')时,退出遍历,将该电话号码加入到set中
                    if (res.length() == 8){
                        set.add(res.toString());
                        break;
                    }
                }
            }
            for (String s: set) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
