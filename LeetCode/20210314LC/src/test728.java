import java.util.ArrayList;
import java.util.List;

public class test728 {
}


class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; ++i){
            if(isSelfNum(i)){
                list.add(i);
            }
        }
        return list;
    }

    public boolean isSelfNum(int n){
        int num = n;
        while(n > 0){
            int tmp = n % 10;
            if(tmp != 0 ){
                if(num % tmp != 0){
                    return false;
                }
            }else
                return false;

            n /= 10;
        }
        return true;
    }
}