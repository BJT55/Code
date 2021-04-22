import java.util.*;

public class Robot {
    public static int countWays(int x, int y) {
        // write code here
        int i = x-1, j = y-1;
        if(i == 0 && j == 0){
            return 0;
        }
        if(i == 0 || j == 0){
            return 1;
        }
        return countWays(x-1,y) + countWays(x,y-1) ;
    }

    public static void main(String[] args) {
        System.out.println(countWays(3,3));
    }
}