import java.util.Scanner;

public class Day08_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] strs = new String[n];
        for (int i = 0; i < n; ++i){
            strs[i] = in.nextLine();
        }

        if (sortByDictionary(strs) && sortByLength(strs)){
            System.out.println("both");
        }else if (sortByLength(strs)){
            System.out.println("lengths");
        }else if (sortByDictionary(strs)){
            System.out.println("lexicographically");
        }else {
            System.out.println("none");
        }
    }
    public static boolean sortByDictionary(String[] strs){
        for (int i = 0; i < strs.length-1; ++i){
            if (strs[i].compareTo(strs[i+1]) > 0){
                return false;
            }
        }
        return true;
    }
    public static boolean sortByLength(String[] strs){
        for (int i = 0; i < strs.length-1; ++i){
            if (strs[i].length() > strs[i+1].length()){
                return false;
            }
        }
        return true;
    }
}
