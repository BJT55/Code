import java.util.Arrays;

class Solution66 {
    public int[] constructArr(int[] a) {
        int[] res = new int[a.length];
        Arrays.fill(res,1);
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; ++j){
                if(j != i){
                    res[i] *= a[j];
                }
            }
        }
        return res;
    }
}