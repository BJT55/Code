public class test566 {

}

class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int pastR = nums.length;
        int pastC = nums[0].length;
        if(pastC*pastR != r*c)
            return nums;
        int[][] ans = new int[r][c];
        for(int i = 0; i < r*c; ++i){
            ans[i/c][i%c] = nums[i/pastC][i%pastC];
        }
        return ans;
    }
}
