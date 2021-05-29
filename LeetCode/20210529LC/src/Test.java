public class Test {
    public static void main(String[] args) {
        int sum = 0;
        int[] num = {0,62,28,31,60,31,60,31,62,60,62,30,62};
        for (int n : num){
            sum += n;
        }
        System.out.println(sum);
    }
}
