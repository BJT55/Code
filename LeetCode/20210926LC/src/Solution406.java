import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]){
                    return o2[0] - o1[0];
                }else {
                    return o1[1] - o2[1];
                }
            }
        });

        List<int[]> res = new ArrayList<>();
        for (int[] person : people){
            res.add(person[1],person);
        }
        return res.toArray(new int[res.size()][]);
    }
}
