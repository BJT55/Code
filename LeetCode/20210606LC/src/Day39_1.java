import java.util.Scanner;

public class Day39_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            StringBuilder s1 = new StringBuilder(in.next());
            StringBuilder s2 = new StringBuilder(in.next());
            int len1 = in.nextInt();
            int len2 = in.nextInt();

            // 补齐 s1 , s2 到 len2 的长度
            for (int i = s1.length(); i < len2; ++i){
                s1.append('a');
            }
            for (int i = s2.length(); i < len2; ++i){
                s2.append('z'+1);
            }

            // 将s1 s2 对应位置的字符相减并保存相减的结果
            int[] arr = new int[len2];
            for (int i = 0; i < len2; ++i){
                arr[i] = s2.charAt(i) - s1.charAt(i);
            }

            // 计算结果
            long res = 0;
            for (int i = len1; i <= len2; ++i){
                for (int j = 0; j < i; ++j) {
                    res += arr[j] * Math.pow(26,i-j-1);
                }
            }
            System.out.println((res-1)%1000007);
        }
    }
}
