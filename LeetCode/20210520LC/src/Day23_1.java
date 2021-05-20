import java.util.*;

public class Day23_1 {
    public int getValue(int[] gifts, int n) {
        // write code here
        Arrays.sort(gifts);
        int mid = gifts[gifts.length/2];
        int count = 0;
        for (int money : gifts){
            if (money == mid){
                count++;
            }
        }
        return count >= gifts.length/2 ? mid : 0;
    }
}