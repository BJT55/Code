import java.util.Arrays;

public class Solution475 {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius = 0;
        int i = 0;
        for (int house : houses){
            while (i < heaters.length && heaters[i] < house){
                i++;
            }
            if (i == 0){
                radius = Math.max(radius,heaters[i]-house);
            }else if (i == heaters.length){
                return Math.max(radius,houses[houses.length-1]);
            }else {
                radius = Math.max(radius,Math.min(heaters[i]-house,house-heaters[i-1]));
            }
        }
        return radius;
    }
}
