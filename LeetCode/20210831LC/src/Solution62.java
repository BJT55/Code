import java.util.ArrayList;
import java.util.List;

public class Solution62 {
    public int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(i);
        }
        int index = 0;
        while (n > 1){
            index = (index+m-1)%n;
            list.remove(index);
            n--;
        }
        return list.get(0);
    }

    public int lastRemaining02(int n, int m) {
        int res = 0;
        // 最后一轮剩下俩人, 从 2 开始反推
        for (int i = 2; i <= n; i++){
            res = (res+m)%i;
        }
        return res;
    }
}
