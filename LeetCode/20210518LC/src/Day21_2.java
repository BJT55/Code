import java.util.Scanner;
import java.util.Stack;

public class Day21_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = Integer.parseInt(in.nextLine());
            String str = in.nextLine();
            findLocationOfMP3(n,str);
        }
    }
    public static void findLocationOfMP3(int n, String str){
        int current = 1;
        String res = "";
        int[] tmp = new int[str.length()];
        int i = 0;
        for (char c : str.toCharArray()){
            if (c == 'U'){
                if (current == 1){
                    // 在首位向上翻返回最后一个
                    current = n;
                }else {
                    current--;
                }
            }
            if (c == 'D'){
                if (current == n){
                    // 在尾部向下翻返回第一个
                    current = 1;
                }else {
                    current++;
                }
            }
            tmp[i++] = current;
        }
        int[] num = new int[4];
        for (int i = 0; i < 4; ++i){
            for (int j = 0; j < i; ++j){
                if (num[j] == tmp.peek()) {
                    tmp.pop();
                    --j;
                }
            }
            num[i] = tmp.pop();
        }
        for (int location : num){
            res = location + " " + res;
        }
        System.out.println(res);
        System.out.println(current);
    }
}
