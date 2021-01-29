public class practice03 {
    //递归求 1 + 2 + 3 + ... + 10
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return sum(n - 1) + n;
    }
}
