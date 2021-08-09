public class Test1 {
    public static void main(String[] args) {
        int[] num = {10,2,4,2,21,65,19,43};
        help(num);
        for (int n : num){
            System.out.print(n+" ");
        }
    }

    private static void help(int[] num) {
        int i = 0, j = num.length-1;
        while (i<num.length-1 && j > 0){
            while (i < num.length-1 && i%2 == 0 && num[i]%2 == 0){
                i+=2;
            }
            while (j > 0 && j%2 == 1 && num[j]%2 == 1 ){
                j-=2;
            }
            if (i<num.length-1 && j > 0)
                swap(num,i,j);
        }
    }

    private static void swap(int[] num, int i, int j) {
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }

}
