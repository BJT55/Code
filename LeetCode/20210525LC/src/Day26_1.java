public class Day26_1 {
    public int jumpFloorII(int target) {
        if(target == 0){
            return 0;
        }
        return (int)Math.pow(2,target-1);
    }
}
