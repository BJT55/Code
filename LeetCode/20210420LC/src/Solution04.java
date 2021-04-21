class Solution04 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int totalLen = len1+len2;
        if (totalLen % 2 == 1){
            // 是奇数
            int midIndex = totalLen/2;
            double res = getTheKthElement(nums1,nums2,midIndex+1);
            return res;
        }else {
            int midLeft = totalLen/2-1, midRight = totalLen/2;
            double res = (getTheKthElement(nums1,nums2,midLeft+1) +
                            getTheKthElement(nums1,nums2,midRight+1))/2.0;
            return res;
        }
    }
    public int getTheKthElement(int[] nums1, int[] nums2, int k){
        int len1 = nums1.length, len2 = nums2.length;
        int kthElement = 0;
        int index1=0, index2=0;

        while (true){
            //到达边界
            if (index1 == len1){
                return nums2[index2+k-1];
            }
            if (index2 == len2){
                return nums1[index1+k-1];
            }

            if (k == 1){
                return Math.min(nums1[index1],nums2[index2]);
            }

            int half = k/2;
            int newIndex1 = Math.min(index1+half,len1)-1;
            int newIndex2 = Math.min(index2+half,len2)-1;
            int a = nums1[newIndex1], b = nums2[newIndex2];
            if (a <= b){
                k = k - (newIndex1-index1+1);
                index1 = newIndex1+1;
            }else {
                k = k - (newIndex2-index2+1);
                index2 = newIndex2+1;
            }
        }
    }
}