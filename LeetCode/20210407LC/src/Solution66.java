class Solution66 {
    public int[] constructArr(int[] a) {
        int[] res = new int[a.length];
        for(int i = 0, j = 1; i < a.length; ++i){
            res[i] = j;
            j *= a[i];
        }
        for(int i = a.length-1, j = 1; i >= 0; --i){
            res[i] *= j;
            j *= a[i];
        }
        return res;
    }
}