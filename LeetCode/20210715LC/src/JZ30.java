public class JZ30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int res = array[0];
        int tmp = 0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            tmp += array[i];
            res = res > tmp ? res : tmp;
            if (tmp < 0){
                tmp = 0;
            }
        }
        return res;
    }
}
