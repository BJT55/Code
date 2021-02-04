public class test {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        char c = 'A';
        sum(arr,c);
        System.out.println(arr[0]);
        System.out.println(sum(arr,c));
    }

    public static char sum(int[] arr,char c){
        arr[0] = 3;
        c = 'B';
        return c;
    }
}
