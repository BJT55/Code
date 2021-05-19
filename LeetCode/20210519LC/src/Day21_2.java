import java.util.Scanner;

public class Day21_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int songs = in.nextInt();
            String str = in.next();
            int top = 1; // 记录当前页面的第一首歌
            int current = 1;  // 记录当前位置的歌
            for (int i = 0; i < str.length(); ++i){
                if (str.charAt(i) == 'U'){
                    if (top == current){
                        top = top == 1 ? songs - 3 : top - 1;
                    }
                    current = (current == 1) ? songs : current - 1;
                }else if (str.charAt(i) == 'D'){
                    if (top + 3 == current){
                        top = current == songs ? 1 : top + 1;
                    }
                    current = (current == songs) ? 1 : current + 1;
                }
            }

            if (songs < 4){
                top = 1;
            }
            for (int i = 0; i < 3 && i < songs - 1; ++i){
                System.out.println(top+i + " ");
            }
            System.out.println(top + ( 4>songs ? songs-1 : 3));
            System.out.println(current);
        }
    }
}
