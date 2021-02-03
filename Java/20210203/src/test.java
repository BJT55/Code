public class test {
    public static void main(String[] args) {
        int x = 0;
        func(x);
        System.out.println(x);
    }

    public static int func(int x){
        int y = x;
        if (x == 0){
            y = 1;
        }
        return y;
    }
}
