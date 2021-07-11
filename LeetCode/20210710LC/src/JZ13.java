public class JZ13 {
    public int[] reOrderArray (int[] array) {
        // write code here
        int index = 0;
        int[] res = new int[array.length];
        for(int i : array){
            if(i % 2 != 0){
                // 奇数在前
                res[index++] = i;
            }
        }
        for(int i : array){
            if(i % 2 == 0){
                res[index++] = i;
            }
        }
        return res;
    }
}
