import java.util.Scanner;

public class Day18_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            System.out.println(match(str1,str2,0,0));
        }
    }
    public static boolean match(String a, String b, int i, int j){
        if (a.length() == i && b.length() == j){
            return true;
        }
        if (a.length() == i || b.length() == j){
            return false;
        }

        if (a.charAt(i) == '?'){
            return match(a,b,i+1,j+1);
        }else if (a.charAt(i) == '*'){
            return match(a,b,i+1,j) ||
                    match(a,b,i+1,j+1) ||
                    match(a,b,i,j+1);
        }else if (a.charAt(i) == b.charAt(j)){
            return match(a,b,i+1,j+1);
        }else {
            return false;
        }
    }
}
