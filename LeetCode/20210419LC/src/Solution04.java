class Solution04 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int mid = len/2;
        boolean flag = true;
        if(len % 2 == 0){
            flag = false;
        }
        int a = 0, b = 0;
        int index = 0;
        int[] tmp = new int[len];
        while(a < nums1.length && b < nums2.length && index <= mid+1){
            if(nums1[a] <= nums2[b]){
                tmp[index++] = nums1[a++];
            }else{
                tmp[index++] = nums2[b++];
            }
        }
        if(flag)
            return tmp[mid]/1.0;
        return (tmp[mid]+tmp[mid+1])/2.0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}