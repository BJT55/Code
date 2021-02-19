import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test350 {
}

/*
// 方法一：
class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] ret = new int[len1 + len2];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index = 0, index1 = 0, index2 = 0;
        while(index1 < len1 && index2 < len2){
            if(nums1[index1] == nums2[index2]){
                ret[index++] = nums1[index1];
                index1++;
                index2++;
            }else if(nums1[index1] < nums2[index2]){
                index1++;
            }else{
                index2++;
            }
        }
        return Arrays.copyOfRange(ret,0,index);
    }
}*/


// 方法二： 哈希表
class Solution350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) return intersect(nums2,nums1);

        Map<Integer,Integer> map =new HashMap<>();
        for(int num : nums1){
            int count = map.getOrDefault(num,0) + 1;
            map.put(num,count);
        }

        int[] ret = new int[nums1.length];
        int index = 0;
        for(int num : nums2){
            int count = map.getOrDefault(num,0);
            if(count > 0){
                ret[index++] = num;
                count--;
                if(count > 0){
                    map.put(num,count);
                }else map.remove(num);
            }
        }
        return Arrays.copyOfRange(ret,0,index);
    }
}