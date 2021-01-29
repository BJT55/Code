public class practice02 {
    //用递归方法，输入一个非负整数，返回组成它的数字之和
    public static void main(String[] args) {
        System.out.println(sum(12345));
    }
    public static int sum(int x){
        if (x < 10){
            return x;
        }
        return sum(x / 10) + x % 10;
    }
}
