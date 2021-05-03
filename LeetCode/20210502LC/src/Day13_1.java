import java.util.ArrayList;
import java.util.Scanner;

public class Day13_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < str.length(); ++i){
            char c = str.charAt(i);
            if (String.valueOf(c).equals("\"")){
                flag = flag ? false : true;
                continue;
            }
            if (String.valueOf(c).equals(" ") && !flag){
                list.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }else {
                stringBuilder.append(c);
            }
        }
        list.add(stringBuilder.toString());
        System.out.println(list.size());
        for (String s : list){
            System.out.println(s);
        }
    }
}
