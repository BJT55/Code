class Solution33 {
    public boolean verifyPostorder(int[] postorder) {
        return help(postorder,0,postorder.length-1);
    }
    public boolean help(int[] postorder, int i, int j){
        if (i >= j) return true;

        int p = i;
        while (postorder[p] < postorder[j]){
            p++;
        }
        int m = p;
        while (postorder[p] > postorder[j]){
            p++;
        }
        return p == j && help(postorder,i,m-1) && help(postorder,m,j-1);
    }
}