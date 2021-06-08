import java.util.Scanner;

public class Day44_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            String[] str = s.split(" ");
            StringBuilder res = new StringBuilder();
            String tmp = "";
            for (int i = str.length-1; i >= 0; i--) {
                boolean flag = false; // 标志是否存在非字母字符
                for (int j = str[i].length()-1; j >= 0 ; j--) {
                    if (!Character.isLetter(str[i].charAt(j))){
                        flag = true;
                        break;
                    }
                }
                if (!flag){
                    // 该字符串全为字母
                    res.append(str[i]);
                }else {
                    tmp = "";
                    for (int j = str[i].length()-1; j >= 0 ; j--) {
                        if (Character.isLetter(str[i].charAt(j))){
                            tmp = str[i].charAt(j) + tmp;
                        }else {
                            res.append(tmp + " ");
                            tmp = "";
                        }
                    }
                }
                if (tmp != ""){
                    res.append(tmp);
                }
                if (i != 0){
                    res.append(" ");
                }
            }
            System.out.println(res.toString());
        }
    }
}
