import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] easy = {'e','a','s','y'};
        while (in.hasNext()){
            String s = in.nextLine();
            s = s.toLowerCase();
            int count = 0;
            int index = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == easy[index]){
                    index++;
                    if (s.charAt(i) == 'y'){
                        count++;
                        index = 0;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
