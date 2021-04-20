import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";
        while (in.hasNext()){
            s = in.nextLine();
            String[] tmp = s.split(" ");
            int[] num = new int[100];
            for(int i = 0; i < tmp.length; ++i){
                num[i] = Integer.valueOf(tmp[i]);
            }
            System.out.println(Solution(num,tmp.length-1,num[tmp.length-1]));
        }
    }

    public static String Solution(int[] num, int len, int k){
        sort(num,len);
        String res = "";
        for(int i = 0; i < k; ++i){
            res += num[i]+" ";
        }
        return res.trim();
    }
    public static void sort(int[] num,int len){
        for (int i = 0; i < len; ++i){
            for (int j = 0; j < len-1; ++j){
                if (num[j]>num[j+1]){
                    int tmp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tmp;
                }
            }
        }
    }
}
