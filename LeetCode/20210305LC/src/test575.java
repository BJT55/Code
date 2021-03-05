import java.util.Arrays;
import java.util.HashSet;

public class test575 {

}

/*
class Solution575 {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int count = 1;
        for (int i = 1; i < candyType.length && count < candyType.length/2; ++i){
            if (candyType[i] > candyType[i-1])
                count++;
        }
        return count;

    }
}*/

class Solution575 {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for (int candy : candyType){
            set.add(candy);
        }
        return Math.min(set.size(),candyType.length / 2);
    }
}