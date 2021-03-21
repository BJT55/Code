public class MySort {
    // 插入排序
    public static void insertSort(int[] arr){
        // 进行 N 次插入过程
        for (int bound = 1; bound < arr.length; ++bound){
            // 已排序区间 [0，bound)
            // 未排序元素 [bound,length)
            int v = arr[bound];
            int cur = bound-1;
            for (; cur >= 0; cur--){
                if (arr[cur] > v){
                    arr[cur+1] = arr[cur];
                }else{
                    break;
                }
            }
            arr[cur + 1] = v;
        }
    }
}
