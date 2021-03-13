import java.util.*;

public class test697 {
}


/*
class Solution697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        for(int i = 0; i < nums.length; ++i){
            if(map.containsKey(nums[i])){
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            }else{
                // int[]: 出现次数，第一次出现位置，最后出现位置
                map.put(nums[i],new int[]{1,i,i});
            }
        }

        int mostNum = 0, minLen = 0;
        for(Map.Entry<Integer, int[]> entry : map.entrySet()){
            int[] arr = entry.getValue();
            if(mostNum < arr[0]){
                mostNum = arr[0];
                minLen = arr[2] - arr[1] + 1;
            }
            else if(mostNum == arr[0]){
                minLen = Math.min(minLen, arr[2] - arr[1] + 1);
            }
        }
        return minLen;
    }
}*/


class Solution697 {
    public int findShortestSubArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[50000];
        int maxNum = 0; // 众数
        for (int num : nums){
            arr[num]++;
            maxNum = Math.max(maxNum, arr[num]);
        }

        // 滑动窗口求与度相等的最短连续子数组长度
        int minLen = Integer.MAX_VALUE;
        int start = 0, end = 0;
        arr = new int[50000];
        while (end < nums.length){
            arr[nums[end]]++;
            end++;
            while (arr[nums[end-1]] == maxNum){
                minLen = Math.min(minLen, end - start);
                arr[nums[start]]--;
                start++;
            }
        }
        return minLen;
    }
}