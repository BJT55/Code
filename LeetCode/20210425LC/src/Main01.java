import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println();
    }
    public static void Solution(String s){
        int i = 0, j = 0;
        int res = 0;
        while (j < s.length()){
            int tmp = i;
            if (s.charAt(tmp) == ' ' && tmp == i){
                tmp++;
                i++;
            }
            else if (s.charAt(tmp) == ' ' && tmp != i){
                tmp++;
                j++;
            }
            else if (s.substring(i,i+5).equals("xcopy")){
                res++;
            }
            else if (s.substring(i,i+1).equals("/s")){
                res++;
            }
            else if (s.substring(i,i+2).equals("c:\\")){
                res++;
            }

        }
    }
}
