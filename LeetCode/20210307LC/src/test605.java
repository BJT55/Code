public class test605 {
}


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 1; // 假设在数组左边添加 0
        int num = 0;  // 记录可种花的数目
        for (int i = 0; i < flowerbed.length; ++i){
            if (flowerbed[i] == 0)
                count++;
            else
                count = 0;
            // 每三个 0 种一次花
            if (count == 3){
                num++;
                count = 1;
            }
        }
        if (count == 2)
            // 假设最后两位都为 0，则可以在最末尾放置 1
            num++;
        return n <= num;
    }
}