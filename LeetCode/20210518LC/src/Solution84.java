class Solution84 {
    public static int largestRectangleArea(int[] heights) {
        int res = 0;
        int start = 0, end = 0;
        while (end < heights.length){
            if (heights[end] >= heights[start]){
                int h = heights[start] >= heights[end] ? heights[end] : heights[start];
                int area = (end-start+1)*h;
                if (area >= res){
                    res = area;
                    end++;
                }else {
                    start++;
                    end = start;
                }
            }
            else {
                start++;
                end = start;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}