public class JZ16 {
    public double myPow(double x, int n) {
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return x;
        }
        if (n == -1){
            return 1/x;
        }

        double a = myPow(x,n/2);
        double b = myPow(x,n%2);
        return a*a*b;
    }
}
