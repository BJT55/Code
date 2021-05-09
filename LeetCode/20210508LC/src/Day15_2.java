import java.util.Scanner;

public class Day15_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x0 = in.nextLong();
        long m = 1000000007; //取模的值
        long s = 100000; //神秘力量使用的次数

        long[] begin = new long[3]; // f(x) = 4x+3 执行3次

        // 3次取模
        begin[0] = x0;
        begin[1] = ( 4 * begin[0] + 3) % m;
        begin[2] = ( 4 * begin[1] + 3) % m;

        long minStep = s;  // 神秘力量使用剩余次数
        long cur = 0;
        int step = 0; // 执行的次数

        for (int i = 0; i < 3; ++i){
            cur = begin[i];
            step = i;
            while (cur != 0 && step < minStep){
                cur = (8 * cur + 7) % m;
                step++;
            }
            minStep = minStep < step ? minStep : step;
        }
        if (minStep < s){  //如果执行步数没有超s输出最小步长
            System.out.println(minStep);
        }else {  //超过返回-1
            System.out.println(-1);
        }
    }
}
