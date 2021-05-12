import java.util.Scanner;

public class Day22_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int monsterNum = in.nextInt();
            int power = in.nextInt();
            int res = power;
            int[] monsters = new int[monsterNum];
            for (int i = 0; i < monsterNum; ++i){
                monsters[i] = in.nextInt();
            }

            for (int num : monsters){
                if (num <= res){
                    res += num;
                }else {
                    res += commonDivisor(num,res);
                }
            }
            System.out.println(res);
        }
    }
    // 最大公约数
    public static int commonDivisor(int a, int b){
        int tmp = a < b ? a : b;
        for (int i = tmp; i >= 1; --i ){
            if (a%i == 0 && b%i == 0){
                return i;
            }
        }
        return 1;
    }
}
