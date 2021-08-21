public class Solution33 {
    public boolean verifyPostorder(int[] postorder) {
        if (postorder.length < 2) return true;
        return verify(postorder,0,postorder.length-1);
    }

    private boolean verify(int[] postorder, int left, int right) {
        if (left >= right) return true;
        int root = postorder[left]; // 当前树的根节点的值

        int k = left;
        while (k < right && postorder[k] < root){
            // 找到第一个大于根节点值的, 从他开始向后都在右子树上
            k++;
        }

        for (int i = k; i < right; i++){
            // 判断后续的区域是否都大于根节点
            if (postorder[k] < root){
                return false;
            }
        }

        // 检查左右子树
        if (!verify(postorder, left, k-1)){
            return false;
        }
        if (!verify(postorder, k, right-1)){
            return false;
        }
        return true;
    }
}
