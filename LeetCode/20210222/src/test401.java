import java.util.ArrayList;
import java.util.List;

public class test401 {

}
class Solution401 {
    List<String> ret;
    public List<String> readBinaryWatch(int num) {
        ret = new ArrayList<>();
        if(num < 0) return ret;
        int[] nums = new int[]{8,4,2,1,32,16,8,4,2,1};
        backTrack(num,nums,0,0,0);
        return ret;
    }

    public void backTrack(int num,int[] nums, int start, int hour, int minute){
        if(num == 0){
            if(hour > 11 || minute > 59) return;
            StringBuilder tmp = new StringBuilder();
            tmp.append(hour);
            tmp.append(":");
            if(minute < 10)  tmp.append(0);
            tmp.append(minute);
            ret.add(new String(tmp));
            return ;
        }
        for(int i = start; i < nums.length; ++i){
            if(i<4) hour += nums[i];
            else minute += nums[i];
            backTrack(num-1,nums,i+1,hour,minute);
            if(i<4) hour -= nums[i];
            else minute -= nums[i];
        }
    }
}