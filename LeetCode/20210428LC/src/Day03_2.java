public class Day03_2 {
    public int MoreThanHalNum(int[] arr){
        if (arr == null || arr.length == 0)
            return 0;

        int result= arr[0];
        int count = 0;
        // 不同时两两抵消
        for (int i = 0; i < arr.length; ++i){
            if (count != 0){
                if (arr[i] == result){
                    count++;
                }else {
                    count--;
                }
            }else {
                result = arr[i];
                count = 1;
            }
        }
        // 此时的 result 为数组中的众数,判断此众数是否超过数组的一半
        count = 0;
        for (int i : arr){
            if (i == result){
                count++;
            }
        }
        return count > arr.length/2 ? result : 0;
    }
}
