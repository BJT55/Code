public class Solution01 {
    public static void main(String[] args) {
        System.out.println(getResult(1000, 500, 3, 1));
    }
    public static String getResult (int A, int B, int a, int b) {
        // write code here
        int n = a/b;
        String res = "";
        for (int i = A; i >= 0; i--){
            if (i%n == 0){
                if (i/n >= 1 && i/n <= B){
                    res=i+" "+i/n;
                }
            }
        }
        return res;
    }
}
