import java.util.Scanner;

public class HJ14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            String[] s = new String[n];
            for(int i = 0; i < n; ++i){
                s[i] = in.nextLine();
            }
            sortStrings(s);
            for(String word : s){
                System.out.println(word);
            }
        }
    }

    private static void sortStrings(String[] s) {
        String tmp = "";
        for (int i = 0; i < s.length-1; i++) {
            for (int j = i+1; j < s.length; j++) {
                if (s[i].compareTo(s[i-1]) > 0){
                    tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }
    }
}
