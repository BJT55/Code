import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Day46_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        int count = 0;
        while (in.hasNext()){
            String s = in.next();
            int n = in.nextInt();
            String[] ss = s.split("\\\\");
            int index = ss.length-1;  // 记录最后的路径的位置
            String tmp;
            if (ss[index].length() <= 16){
                // 判断路径文件名称是否超过16个字符
                tmp = ss[index] + " " + n;
            }else {
                tmp = ss[index].substring(ss[index].length()-16) + " " + n;
            }
            map.put(tmp,map.getOrDefault(tmp,0)+1);
        }

        int i = 0;
        for (String str : map.keySet()) {
            i++;
            if (i > map.keySet().size()-8){
                // 输出最后8条
                System.out.println(str + " " + map.get(str));
            }
        }
    }
}
