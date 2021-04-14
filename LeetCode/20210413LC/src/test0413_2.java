import java.util.Arrays;

public class test0413_2 {
    public static int MoreThanHalfNum_Solution(int [] array) {
        if(array.length == 1){
            return array[0];
        }
        Arrays.sort(array);
        int count = 1, max = 0;
        for(int i = 1; i < array.length; ++i){
            if(array[i] == array[i-1]){
                count++;
            }else{
                max = Math.max(max,count);
                if(max >= array.length/2){
                    return array[i-1];
                }
                count = 1;
            }
        }
        max = Math.max(max,count);
        if (max >= array.length/2)
            return array[array.length-1];
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(array));
    }
}
