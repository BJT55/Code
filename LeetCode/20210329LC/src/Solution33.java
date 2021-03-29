import java.util.Stack;

class Solution33 {
    public boolean verifyPostorder(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for (int i = postorder.length-1; i >= 0; --i){
            // 逆序根右左，即后面的元素一定不会>最先被访问到的右子树元素
            if (postorder[i] > root){
                return false;
            }
            while (!stack.isEmpty() && stack.peek() > postorder[i]){
                // 数组元素开始往左子树走
                // 找到对应的左子树的根节点，将之前右子树全部弹出，因为不会再往右子树走了
                root = stack.pop();
            }
            stack.add(postorder[i]);
        }
        return true;

    }
}