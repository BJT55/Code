public class test492 {
}

class Solution492 {
    public int[] constructRectangle(int area) {
        int wide = (int) Math.sqrt(area);
        while(area % wide != 0){
            wide--;
        }
        return new int[]{area/wide,wide};
    }
}