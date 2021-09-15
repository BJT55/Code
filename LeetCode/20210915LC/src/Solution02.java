import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            String a = "", b = "";
            int i = 0;
            for (; i < s.length(); i++){
                char c = s.charAt(i);
                if (c == ';') {
                    i++;
                    break;
                }else {
                    if (Character.isDigit(c)){
                        a = a + c + " ";
                    }
                }
            }
            for (; i < s.length(); i++){
                char c = s.charAt(i);
                if (Character.isDigit(c)){
                    b = b + c + " ";
                }
            }
            String[] aa = a.split(" ");
            String[] bb = b.split(" ");
            int[] num1 = new int[0];
            int[] num2 = new int[0];
            if (aa.length != 0){
                num1 = new int[aa.length];
                for (int j = 0; j < aa.length; j++){
                    if (!aa[j].equals("")) {
                        num1[j] = Integer.parseInt(aa[j]);
                    }
                }
            }
            if (bb.length != 0){
                num2 = new int[bb.length];
                for (int j = 0; j < bb.length; j++){
                    if (!bb[j].equals("")) {
                        num2[j] = Integer.parseInt(bb[j]);
                    }
                }
            }
            Arrays.sort(num1);
            Arrays.sort(num2);
            if (aa.length == 0 || bb.length == 0){
                if (aa.length == 0){
                    System.out.println(num2[num2.length-4]);
                }else {
                    System.out.println(num1[num1.length-4]);
                }
            }else {
                System.out.println(findFour(num1,num2));
            }

        }
    }

    private static int findFour(int[] a, int[] b) {
        int[] num = new int[a.length+b.length];
        int i = 0, j = 0;
        int index = 0;
        while (i < a.length && j < b.length){
            if (a[i] <= b[j]){
                num[index++] = a[i++];
            }else {
                num[index++] = b[j++];
            }
        }

        while (i < a.length){
            num[index++] = a[i++];
        }
        while (j < b.length){
            num[index++] = b[j++];
        }
        return num[num.length-4];
    }
}
