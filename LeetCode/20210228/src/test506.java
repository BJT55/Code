import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test506 {
    public static void main(String[] args) {
        Solution506 s = new Solution506();
        int[] score = {3,6,9,1};
        System.out.println(s.findRelativeRanks(score));
    }
}
/*
// 自己：
class Solution506 {
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        String[] rank = new String[len];
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < len; ++i){
            map.put(score[i],i);
        }

        int count = 1;
        sort(score);
        for (int i = 0; i < len; ++i){
            switch (count){
                case 1:
                    rank[map.get(score[i])] = "Gold Medal";
                    break;
                case 2:
                    rank[map.get(score[i])] = "Silver Medal";
                    break;
                case 3:
                    rank[map.get(score[i])] = "Bronze Medal";
                    break;
                default:
                    rank[map.get(score[i])] = "" + count;
            }
            count++;
        }
        return rank;
    }
    public void sort(int[] score){
        for (int i = 0; i < score.length - 1; ++i){
            for(int j = i+1; j < score.length; ++j){
                if(score[i] < score[j]){
                    int tmp = score[j];
                    score[j] = score[i];
                    score[i] = tmp;
                }
            }

        }
    }
}
*/
class Solution506{
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        String[] result = new String[len];
        int maxScore = 0;
        for (int num : score){
            if (maxScore < num){
                maxScore = num;
            }
        }

        int[] rank= new int[maxScore + 1];
        for (int i = 0; i < len; ++i){
            rank[score[i]] = i + 1;
        }
        int count = 1;
        for (int i = rank.length - 1; i >= 0; --i){
            if (rank[i] != 0){
                switch (count){
                    case 1 :
                        result[rank[i] - 1] = "Gold Medal";
                        break;
                    case 2 :
                        result[rank[i] - 1] = "Silver Medal";
                        break;
                    case 3 :
                        result[rank[i] - 1] = "Bronze Medal";
                        break;
                    default:
                        result[rank[i] - 1] = String.valueOf(count);
                }
                count++;
            }
        }
        return result;
    }
}