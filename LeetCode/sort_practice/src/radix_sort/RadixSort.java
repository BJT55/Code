package radix_sort;


public class RadixSort {
    public static void main(String[] args) {
        int[] nums = {3,54,6,12,32,89,23,44,90};
        radixSort(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void radixSort(int[] nums) {
        // 求出数组中的最大值
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max){
                max = nums[i];
            }
        }

        int maxCount = 0;
        // 判断位数
        while (max > 0){
            max /= 10;
            maxCount++;
        }

        // 定义一个二维数组来表示桶
        int[][] bucket = new int[10][nums.length];
        // 定义一个一维数组来记录各个桶中存放的数据的个数
        int[] count = new int[10];

        for (int i = 0, n=1; i < maxCount; i++, n*=10) {
            for (int j = 0; j < nums.length; j++) {
                // 记录第x位数的值
                int digit = nums[j]/n%10;
                // 放入对应的桶中
                bucket[digit][count[digit]] = nums[j];
                // 该值在对应桶中的个数++
                count[digit]++;
            }

            // 按照桶的顺序, 将数据取出放入原来的数组中
            int index = 0;
            for (int k = 0; k < count.length; k++) {
                if (count[k] != 0){  //桶中有数据
                    for (int t = 0; t < count[k]; t++) {
                        nums[index++] = bucket[k][t];
                    }
                }
                // 每一轮处理后, 需要将count中的值清空
                count[k] = 0;
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
