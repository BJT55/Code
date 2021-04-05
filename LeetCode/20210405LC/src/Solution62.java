import java.util.ArrayList;

class Solution62 {
    public int lastRemaining(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; ++i){
            list.add(i);
        }
        int index = 0; // 待删除元素值
        while(n > 1){
            index = (index + m - 1)%n;
            list.remove(index);
            n--;
        }
        return list.get(0);
    }

    public int lastRemaining02(int n, int m) {
        int res = 0;
        for(int i = 2; i <= n; ++i){
            res = (res + m)%i;
        }
        return res;
    }
}