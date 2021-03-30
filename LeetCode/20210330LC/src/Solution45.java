import java.util.ArrayList;
import java.util.List;

class Solution45 {
    public String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for(int num : nums){
            list.add(String.valueOf(num));
        }
        list.sort((o1,o2) -> (o1+o2).compareTo(o2+o1));
        return String.join("",list);
    }
}