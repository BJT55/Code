import java.util.Scanner;
// 字符串计数
public class Day39_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            StringBuilder s1 = new StringBuilder(in.next());
            StringBuilder s2 = new StringBuilder(in.next());
            int len1 = in.nextInt();
            int len2 = in.nextInt();

            // 补全 s1,s2
            // 在 s1 后面补 'z'+1
            for (int i = s1.length(); i < len2; i++) {
                s1.append('z'+1);
            }
            // 在 s2 后面补全 'a'
            for (int i = s2.length(); i < len2; i++) {
                s2.append('a');
            }

            // 计算 s1 和 s2 对应位置的字符差并存入到数组中
            int[] arr = new int[len2];
            for (int i = 0; i < len2; i++) {
                arr[i] = s2.charAt(i) - s1.charAt(i);
            }

            // 计算结果
            int res = 0;
            for (int i = len1; i <= len2; i++) {
                for (int j = 0; j < i; j++) {
                    res += arr[j] * Math.pow(26,i-j-1);
                }
            }
            System.out.println((res-1)%1000007);
        }
    }
}
