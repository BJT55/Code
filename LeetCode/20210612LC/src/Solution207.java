import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution207 {
    List<List<Integer>> edges;
    int[] dp;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        dp = new int[numCourses];
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
            ++dp[info[0]];
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (dp[i] == 0){
                queue.offer(i);
            }
        }

        int visited = 0;
        while (!queue.isEmpty()){
            ++visited;
            int tmp = queue.poll();
            for (int v : edges.get(tmp)) {
                --dp[v];
                if (dp[v] == 0){
                    queue.offer(v);
                }
            }
        }

        return visited == numCourses;
    }
}