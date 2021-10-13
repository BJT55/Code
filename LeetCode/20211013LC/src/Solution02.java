import com.sun.javafx.image.impl.IntArgb;

import java.util.Arrays;
import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String a = in.nextLine();
            String b = in.nextLine();
            a = a.replace('[',',');
            a = a.replace(']',',');
            b = b.replace('[',',');
            b = b.replace(']',',');
            String[] aa = a.split(",");
            String[] bb = b.split(",");
            int[] numa = new int[aa.length-1];
            int[] numb = new int[bb.length-1];
            for (int i = 1; i <= numa.length; i++) {
                numa[i-1] = Integer.parseInt(aa[i]);
            }
            for (int i = 1; i <= numb.length; i++) {
                numb[i-1] = Integer.parseInt(bb[i]);
            }
            Arrays.sort(numa);
            Arrays.sort(numb);
            int count = 0;
            int ai = 0, bi = 0;
            while (ai < numa.length && bi < numb.length){
                if (numa[ai] >= numb[bi]){
                    count++;
                    ai++;
                    bi++;
                }else {
                    ai++;
                }
            }
            System.out.println(count);
        }
    }
}
