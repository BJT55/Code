import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Day46_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<>();
        while (in.hasNext()){
            String str = in.nextLine();
            String[] ss = str.split("\\\\");
            String[] s = ss[ss.length-1].split(" ");
            String file = s[0];  // 记录最后文件名称
            String num = s[1]; // 记录文件行号
            String tmp = "";
            if (file.length() <= 16){
                tmp = file + " " + num;
            }else {
                tmp = file.substring(file.length()-16) + " " + num;
            }
            map.put(tmp,map.getOrDefault(tmp,0)+1);
        }
        int start = 0;
        for (String files: map.keySet()) {
            start++;
            if (start > map.keySet().size()-8){
                System.out.println(files + " " + map.get(files));
            }

        }
    }
}
