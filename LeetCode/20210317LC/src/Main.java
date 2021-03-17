import java.util.List;
import java.util.Scanner;

public class Main{
    public static class TreeNode{
        char val;
        TreeNode left;
        TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    // 根据给定的字符串创建二叉树并以中序输出（#代表空格）
    public static int index = 0;
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            index = 0;
            String str = scanner.next();
            TreeNode root = build(str);
            inOrder(root);
            System.out.println();
        }
    }
    public static TreeNode build(String s){
        char c = s.charAt(index);
        if (c == '#')
            return null;

        TreeNode root = new TreeNode(c);
        index++;
        root.left = build(s);
        index++;
        root.right = build(s);
        return root;
    }
    public static void inOrder(TreeNode root){
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
}