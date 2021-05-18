public class Day26_1 {
     public int jumpFloorII(int target) {
         if(target == 1){
             return 1;
         }
         int a = 1, b = 0;
         while (target > 1){
             b = 2*a;
             a = b;
             target--;
         }
         return a;
     }
}
