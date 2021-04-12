import java.util.Scanner;

public class test0413_1  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < arr.length; ++i){
                arr[i] = scanner.nextInt();
            }
            System.out.println(solution(n,arr));
        }
    }
    public static int solution(int n, int[] arr){
        int count = 1;
        if(arr.length == 1)
            return 1;

        int flag;
        if(arr[1] - arr[0] > 0){
            flag = 1;
        }
        else  flag = 0;

        for(int i = 2; i < arr.length; i++){
            if(flag == 1){
                if(arr[i] - arr[i-1] >= 0){
                    continue;
                }
                else {
                    flag = -1;
                    count++;
                }
            }else {
                if(arr[i] - arr[i-1] <= 0){
                    continue;
                }else{
                    flag = 1;
                    count++;
                }
            }
        }
        return count;
    }
}