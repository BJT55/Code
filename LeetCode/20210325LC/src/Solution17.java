class Solution17 {
    public int[] printNumbers(int n) {
        int index =(int)Math.pow(10,n)-1;
        int[] ret = new int[index];
        for(int i = 0; i < index; ++i){
            ret[i] = i+1;
        }
        return ret;
    }
}