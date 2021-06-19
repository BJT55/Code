import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Day47_2 {
    // 记录一个人的身高和体重
    static class People{
        int weight;
        int height;

        public People(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            People[] people = new People[n];
            for (int i = 0; i < n; i++) {
                int index = in.nextInt();
                people[index-1] = new People(in.nextInt(),in.nextInt());
            }

            Arrays.sort(people, new Comparator<People>() {
                @Override
                public int compare(People o1, People o2) {
                    int tmp = o1.height - o2.height;
                    if (tmp != 0){
                        // 身高不相等
                        return tmp;
                    }else {
                        // 身高相等时, 比较体重
                        return o1.weight-o2.weight;
                    }
                }
            });

            int[] dp = new int[n];
            int max = -1;
            for (int i = 0; i < n; i++) {
                dp[i] = 1;
                for (int j = i-1; j >= 0 ; --j) {
                    if (people[i].weight > people[j].weight ||
                        people[i].height == people[j].height &&
                        people[i].weight == people[j].weight){
                        dp[i] = Math.max(dp[j]+1,dp[i]);
                    }
                }
                max = Math.max(max,dp[i]);
            }
            System.out.println(max);
        }
    }
}
