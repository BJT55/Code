import java.util.*;

public class test199 {
}

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
/*
class Solution199 {
    // 广度优先搜索
    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer, Integer> rightValueDepth = new HashMap<>();
        int maxDepth = -1;

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> depthQueue = new LinkedList<>();
        nodeQueue.add(root);
        depthQueue.add(0);

        while (!nodeQueue.isEmpty()){
            TreeNode node = nodeQueue.remove();
            int depth = depthQueue.remove();

            if (node != null){
                maxDepth = Math.max(maxDepth,depth);
                rightValueDepth.put(depth,node.val);

                nodeQueue.add(node.left);
                nodeQueue.add(node.right);
                depthQueue.add(depth+1);
                depthQueue.add(depth+1);
            }
        }

        List<Integer> rightView = new ArrayList<>();
        for (int depth = 0; depth <= maxDepth; depth++){
            rightView.add(rightValueDepth.get(depth));
        }

        return rightView;
    }
}*/


class Solution199{
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        rightSideView(root,list,0,-1);
        return list;
    }
    public int rightSideView(TreeNode root, List<Integer> list, int depth, int maxDepth){
        if (root == null) return maxDepth;
        if (depth > maxDepth){
            list.add(root.val);
            maxDepth = depth;
        }
        maxDepth = rightSideView(root.right,list,depth+1,maxDepth);
        maxDepth = rightSideView(root.left,list,depth+1,maxDepth);
        return maxDepth;
    }
}