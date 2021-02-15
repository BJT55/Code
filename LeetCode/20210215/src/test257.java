import java.util.ArrayList;
import java.util.List;

public class test257 {

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
class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        constructPath(root,"",paths);
        return paths;
    }

    public void constructPath(TreeNode root, String path, List<String> paths){
        if (root != null){
            StringBuilder pathSB = new StringBuilder(path);
            pathSB.append(Integer.toString(root.val));
            if (root.left == null && root.right == null){
                paths.add(pathSB.toString());
            }else {
                pathSB.append("->");
                constructPath(root.left, pathSB.toString(),paths);
                constructPath(root.right, pathSB.toString(), paths);
            }
        }
    }
}
