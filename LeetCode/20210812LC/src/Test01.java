public class Test01 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        if(n == 1 || n == 2) return n;
        n -= 2;
        int a = 1, b = 2, c = 0;
        while (n-- > 0){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
}
