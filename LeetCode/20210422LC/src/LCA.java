import java.util.*;

public class LCA {
    public static int getLCA(int a, int b) {
        // write code here
        if(a == b){
            return a;
        }
        else if (a > b){
            a = a/2;
        }else {
            b = b/2;
        }
        return getLCA(a,b);
    }

    public static void main(String[] args) {
        System.out.println(getLCA(2,3));
    }

}