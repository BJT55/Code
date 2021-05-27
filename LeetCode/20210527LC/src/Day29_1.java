public class Day29_1 {
    public int getFirstUnFormedNum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < arr.length; ++i){
            max += arr[i];
            min = Math.min(min,arr[i]);
        }

        boolean[] form = new boolean[max+1];
        form[0] = true;
        for (int i = 0; i < arr.length; ++i){
            for (int j = max; j >= arr[i]; --j){
                form[j] = form[j-arr[i]] || form[j];
            }
        }
        for (int i = min; i <= max; ++i){
            if (!form[i]){
                return i;
            }
        }
        return max+1;
    }
}
