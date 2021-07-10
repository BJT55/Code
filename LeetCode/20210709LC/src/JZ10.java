public class JZ10 {
    public int rectCover(int target) {
        if(target <= 2){
            return target;
        }

        int a = 1, b = 2;
        for(int i = 3; i <= target; ++i){
            int tmp = b;
            b = a + b;
            a = tmp;
        }
        return b;
    }
}
