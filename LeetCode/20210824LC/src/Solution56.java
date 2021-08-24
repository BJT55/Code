import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1){
            return intervals;
        }

        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        int i = 0, len = intervals.length;
        while (i < len){
            int left = intervals[i][0];
            int right = intervals[i][1];
            while (i < len-1 && right >= intervals[i+1][0]){
                right = Math.max(right,intervals[i+1][1]);
                i++;
            }
            res.add(new int[]{left,right});
        }
        return res.toArray(new int[res.size()][2]);

    }
}
