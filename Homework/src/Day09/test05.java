package Day09;

import java.util.Arrays;

public class test05 {
    public static void main(String[] args) {
        String a = "1011";
        String b = "11001";
        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b){
        StringBuilder s = new StringBuilder();
        int temp = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--,j--) {
            int sum = temp;
            sum += (i >= 0 ? a.charAt(i) - '0' : 0);
            sum += (j >= 0 ? b.charAt(j) - '0' : 0);
            s.append(sum % 2);  // 如果俩者都为 1，则当前位为0
            temp = sum / 2;   // 如果两者都为 1，则产生进位 1
        }
        s.append(temp == 1 ? temp : ""); // 判断最后一次计算是否产生进位
        return s.reverse().toString();
    }
}
