package bucket_sort;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        int[] nums = {3,54,66,12,32,89,23,44,90,0};
        bucketSort(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void bucketSort(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        // 创建桶
        int bucketNum = (max-min) / nums.length+1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketArr.add(new ArrayList<>());
        }
        // 将每个元素放入桶中
        for (int i = 0; i < nums.length; i++) {
            int num = (nums[i] - min)/nums.length;
            bucketArr.get(num).add(nums[i]);
        }
        // 对每个桶进行排序
        for (int i = 0; i < bucketArr.size(); i++) {
            Collections.sort(bucketArr.get(i));
        }

    }

    private static void bucketSort_2(int[] nums) {
        if (nums.length <= 1){
            return;
        }

        ArrayList<ArrayList<Integer>> queue = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            ArrayList<Integer> queue2 = new ArrayList<>();
            queue.add(queue2);
        }

        // 取得数组中最大数
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        // 获取当前最大数的位数
        int maxDigit = 1;
        while (max / 10 > 0){
            maxDigit++;
            max /= 10;
        }


        for (int i = 0; i < maxDigit; i++){  // 循环每一位数
            for (int j = 0; j < nums.length; j++){  // 循环数组,取每一个值
                int x = nums[j] % (int)Math.pow(10,i+1)/(int)Math.pow(10,i);
                ArrayList<Integer> queue3 = queue.get(x);
                queue3.add(nums[j]);
                queue.set(x,queue3);
            }

            int count = 0;
            for (int k = 0; k < 10; k++){
                while (queue.get(k).size() > 0){
                    ArrayList<Integer> queue4 = queue.get(k);
                    nums[count] = queue4.get(0);
                    queue4.remove(0);
                    count++;
                }
            }
        }

    }
}
