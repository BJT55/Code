import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BrokenKeyBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            // 想要输出的
            String expect = scanner.next();
            // 实际输出的
            String actual = scanner.next();
            // 全部转化成大写
            expect = expect.toUpperCase();
            actual = actual.toUpperCase();

            Set<Character> actualSet = new HashSet<>();
            for (int i = 0; i < actual.length(); ++i){
                actualSet.add(actual.charAt(i));
            }

            // 由于坏键不能打印多次，因此创建 Set 存放坏键
            Set<Character> brokenSet = new HashSet<>();

            // 遍历 expect 判断是否出现
            for (int i = 0; i < expect.length(); ++i){
                char c = expect.charAt(i);
                if (!actualSet.contains(c)) {
                    // 不存在，证明该键是坏的
                    if(!brokenSet.contains(c)) {
                        // 判断 坏键 是否已经打印过
                        System.out.print(c);
                        brokenSet.add(c);
                    }
                }
            }
            // 多组用例输出换行
            System.out.println();
        }
    }
}
