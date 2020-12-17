import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().split("\"")[1];
        String t = scanner.nextLine().split("\"")[1];
        int sum = Integer.parseInt(s) + Integer.parseInt(t);
        System.out.println("\""+s+"\"" + "+" +  "\""+t+"\"" + "=" + "\""+sum+"\"" );
    }
}