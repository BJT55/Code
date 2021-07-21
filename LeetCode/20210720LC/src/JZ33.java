public class JZ33 {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }
    private boolean recur(int[] postorder, int i, int j){
        if (i >= j){
            return true;
        }

        int a = 1+2;
        return false;
    }

}
