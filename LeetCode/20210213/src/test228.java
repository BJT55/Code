import java.util.LinkedList;
import java.util.List;
// 给定一个不重复的按升序排序的数组
// 请输出包含这些数字的最小区间，区间内不存在区间以外的数组中的数值
// 例如： [0,1,2,4,5,7]  输出： ["0->2","4->5","7"]
public class test228 {

}

// 自己： 8ms
class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> range = new LinkedList<>();
        if(nums.length == 0) return range;
        if(nums.length == 1) {
            range.add(nums[0]+"");
            return range;
        }
        int index = 0;
        int i = 1;
        for(; i < nums.length; ++i){
            if(nums[i] > nums[i - 1] + 1){
                if(index != i - 1){
                    range.add(nums[index] + "->" + nums[i-1]);
                }else{
                    range.add(nums[i-1] + "");
                }
                index = i;
            }
        }
        if(nums[i-1] == nums[i-2] + 1){
            range.add(nums[index] + "->" + nums[i-1]);
        }else range.add(nums[i-1]+"");
        return range;
    }
}

// 修改：0ms, 100%
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> range = new LinkedList<>();
        int index = 0; //记录区间的起始位置
        for(int i = 0; i < nums.length; i++){
            if(i + 1 == nums.length || nums[i]+1 != nums[i+1]){
                StringBuilder sb = new StringBuilder();
                sb.append(nums[index]);
                if( index != i){
                    sb.append("->").append(nums[i]);
                }
                range.add(sb.toString());
                index = i+1;
            }
        }
        return range;
    }
}