public class test07 {
    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字
    public static void find(int[] a){
        for (int i = 0; i < a.length / 2; i++){
            int flag = 1;
            for (int j = i + 1; j < a.length; j++){
                if( a[i] == a[j]){
                    flag = 0;
                    break;
                }
            }
            if ( flag == 1 ){
                System.out.print(a[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,7,2,3,9,0,0,2,1,4,9,7};
        find(arr);
    }
}
