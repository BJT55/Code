import java.util.HashMap;
import java.util.Map;

class Solution166 {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder res = new StringBuilder();
        long a = numerator, b = denominator;
        if (a > 0 && b < 0 || a < 0 && b > 0){
            res.append('-');
        }
        a = Math.abs(a);
        b = Math.abs(b);
        res.append(a/b);
        if (a % b == 0){
            return res.toString();
        }
        res.append('.');
        Map<Long,Integer> map = new HashMap<>();
        a = (a%b)*10;
        while ((a > 0 && !map.containsKey(a))){
            map.put(a,res.length());
            res.append(a/b);
            a = (a%b)*10;
        }
        if (a == 0){
            return res.toString();
        }
        return res.insert(map.get(a).intValue(),'(').append(')').toString();
    }
}