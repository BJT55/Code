import java.util.*;

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0 || k > arr.length || arr.length == 0 )
            return new int[0];

        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer num1, Integer num2){
                return num2 - num1;
            }
        });
        for(int num : arr){
            if(queue.size() < k){
                queue.offer(num);
            }
            else if(num < queue.peek()){
                queue.poll();
                queue.offer(num);
            }
        }

        int[] res = new int[queue.size()];
        for(int i = 0; i < k; ++i){
            res[i] = queue.poll();
        }
        return res;
    }
}