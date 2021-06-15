import java.util.LinkedList;

class Solution239_2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2){
            return nums;
        }

        LinkedList<Integer> list = new LinkedList<>();
        int[] res = new int[nums.length-k+1];
        for (int i = 0; i < nums.length; i++) {
            while (!list.isEmpty() && nums[list.peekLast()] <= nums[i]){
                // 保证从大到小, 如果前面的数小 则弹出
                list.pollFirst();
            }
            list.addLast(i);
            // 初始化窗口, 等到窗口长度为k时, 下次移动删除过期数值
            if (list.peek() <= i-k){
                list.poll();
            }
            // 窗口长度为k时, 再保存当前窗口的最大值
            if (i-k+1 >= 0){
                res[i-k+1] = nums[list.peek()];
            }
        }
        return res;
    }
}