import java.util.Arrays;

public class test349 {
}

class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] ret = new int[len1 + len2];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index = 0, index1 = 0, index2 = 0;
        while(index1 < len1 && index2 < len2){
            if(nums1[index1] == nums2[index2]){
                if(index == 0 || nums1[index1] != ret[index - 1]){
                    ret[index++] = nums1[index1];
                }
                index1++;
                index2++;
            }else if(nums1[index1] < nums2[index2]){
                index1++;
            }else{
                index2++;
            }
        }
        // 将ret数组下标从 0 开始 到 index 的值复制到新数组中
        return Arrays.copyOfRange(ret,0,index);
    }
}