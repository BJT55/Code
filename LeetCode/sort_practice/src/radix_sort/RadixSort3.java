package radix_sort;


public class RadixSort3 {
    public static void main(String[] args) {
        int[] nums = {3,54,66,12,32,89,23,44,90,72};
        radixSort(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void radixSort(int[] nums) {
        int max = 0;
        for (int n : nums){
            max = Math.max(max,n);
        }

        int maxCount = 0;
        while (max > 0){
            max /= 10;
            maxCount++;
        }

        int[][] bucket = new int[10][nums.length];
        int[] bucketCount = new int[10];

        for (int i = 0, n = 1; i < maxCount; i++, n *= 10) {
            for (int j = 0; j < nums.length; j++) {
                int digit = nums[j]/n%10;
                bucket[digit][bucketCount[digit]] = nums[j];
                bucketCount[digit]++;
            }

            int index = 0;
            for (int k = 0; k < bucketCount.length; k++) {
                if (bucketCount[k] != 0) {
                    for (int t = 0; t < bucketCount[k]; t++) {
                        nums[index++] = bucket[k][t];
                    }
                }
                bucketCount[k] = 0;
            }
        }

    }

    /**
     * 基数排序: 按照从低开始先排序,再收集, 依次向高位进行排序收集,直到最高位排序完毕
     * 时间复杂度: O(d(n+r))
     * 空间复杂度: O(dr+n)
     * d : 位数
     * n : 数组个数
     * r : 基数 (桶个数)
     * 稳定
     */

}
