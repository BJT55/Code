import java.util.ArrayList;
import java.util.List;

public class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0];
        int right = newInterval[1];
        boolean placed = false;
        List<int[]> res = new ArrayList<>();
        for (int[] interval : intervals){
            if (interval[0] > right){
                // 插在新区间右侧且无交集
                if (!placed){
                    res.add(new int[]{left,right});
                    placed = true;
                }
                res.add(interval);
            }else if (interval[1] < left){
                // 插在新区间左侧且无交集
                res.add(interval);
            }else {
                // 与插入区间有交集, 计算并集
                left = Math.min(left,interval[0]);
                right = Math.max(right,interval[1]);
            }
        }
        if(!placed){
            res.add(new int[]{left,right});
        }
        int[][] ans = new int[res.size()][2];
        for (int i = 0; i < res.size(); ++i){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
