import java.util.Scanner;
// 看电影
public class Main03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            in.nextLine();
            String[][] s= new String[n][2];
            for (int i = 0; i < n; i++){
                s[i] = in.nextLine().split("-");
            }

            int[] time = new int[2*n-1];
            int index = 0;
            for(int i = 0; i < s.length; i++){
                time[index++] = changeTime(s[i][0],s[i][1]);
                if (i+1 < s.length) {
                    time[index++] = changeTime(s[i][1],s[i+1][0]);
                }
            }
            int res = 0;
            for (int i = 2; i < time.length; i++){
                int count = 3;
                int j = i;
                int tmp = 0;
                while (count > 0 && j >= 0){
                    if (time[j] <= 0){
                        j--;
                        continue;
                    }
                    tmp += time[j--];
                    count--;
                }
                res = Math.max(res,tmp);
            }
            System.out.println(res);
        }
    }

    private static int changeTime(String a, String b) {
        int hour = (b.charAt(0)-'0')*10+(b.charAt(1)-'0') - ( (a.charAt(0)-'0')*10+(a.charAt(1)-'0') );
        int minute = (b.charAt(3)-'0')*10+(b.charAt(4)-'0') - ( (a.charAt(3)-'0')*10+(a.charAt(4)-'0') );
        return hour*60 + minute;
    }
}
