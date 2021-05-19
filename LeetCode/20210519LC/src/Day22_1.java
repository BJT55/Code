import java.util.Scanner;

public class Day22_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int monsters = in.nextInt();
            int initPower = in.nextInt();
            int[] monsterPower = new int[monsters];
            for (int i = 0; i < monsters; ++i){
                monsterPower[i] = in.nextInt();
            }
            System.out.println(upgrade(initPower,monsterPower));
        }
    }
    public static int upgrade(int init, int[] power){
        for (int i = 0; i < power.length; ++i){
            if (init >= power[i]){
                init += power[i];
            }else {
                init += commonDivisor(init,power[i]);
            }
        }
        return init;
    }
    public static int commonDivisor(int a,int b){
        int res = a < b ? a : b;
        for (int i = res; res > 1; --res){
            if (a%res == 0 && b%res == 0){
                return res;
            }
        }
        return 1;
    }
}
