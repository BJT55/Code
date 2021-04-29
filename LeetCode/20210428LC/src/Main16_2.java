import java.util.Scanner;

public class Main16_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String left = "";
        int mid = 0;
        for (int i = 0; i < s.length(); ++i){
            if (s.charAt(i) != ' ' && s.charAt(i) != '-'){
                left += s.charAt(i);
            }
            else if (s.charAt(i) == '-'){
                mid = i;
                break;
            }
        }
        String right = "";
        for (int i = mid; i < s.length(); ++i){
            if (s.charAt(i) != ' ' && s.charAt(i) != '-'){
                right += s.charAt(i);
            }
        }
        
    }
}
