public class Solution02 {
    public int maxLength (int[] arr) {
        // write code here
        int res = 1;
        int start = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]){
                res = Math.max(res,i-start+1);
            }else {
                start = i;
            }
        }

        start = arr.length-1;
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] < arr[i-1]){
                res = Math.max(res,start-i+1);
            }else {
                start = i;
            }
        }
        return res;
    }
}
