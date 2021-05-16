import java.util.Scanner;

public class Day17_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            String[] s = str.split(" ");
            System.out.println(longNumberAdd(s[0],s[1]));
        }
    }
    public static String longNumberAdd(String a, String b){
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        if (!checkNumber(c1) || !checkNumber(c2)){ // 判断字符串是否符合整数格式
            return "error";
        }

        if (c1.length < c2.length){
            char[] tmp = c1;
            c1 = c2;
            c2 = tmp;
        }
        
        int i = c1.length-1, j = c2.length-1;
        int carry = 0;  // 进位数
        // 将加完后的数放入c1中
        for (; j >= 0; i--,j--){
            int add = c1[i] - '0' + c2[j] - '0' + carry;
            c1[i] = (char)(add%10+'0');
            carry = add/10;
        }

        StringBuilder res = new StringBuilder();
        if (carry != 0){  // 判断最后是否有进位(即判断相加后的位数是否超过最大数的位数)
            res.append(carry);
        }
        for (char num : c1){
            res.append(num);
        }
        return res.toString();
    }
    public static boolean checkNumber(char[] c){
        for (char i : c){
            if (i < '0' || i > '9'){
                return false;
            }
        }
        return true;
    }
}
