import java.util.Scanner;

public class Day05_1 {
    public static void main(String[] args) {
        int ret = 0;
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        int len = str2.length();
        for (int i = 0; i < str1.length(); ++i){
            StringBuilder tmp = new StringBuilder(str1);
            tmp.insert(i,str2); // 将字符串str2插入到tmp中
            String reverseTmp = tmp.reverse().toString(); //将插入后的字符串逆置
            if (reverseTmp.equals(tmp.toString())){
                // 判断是否为回文串
                ret++;
            }
        }
        System.out.println(ret);
    }
}
