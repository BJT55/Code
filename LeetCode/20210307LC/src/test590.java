import java.util.*;

public class test590 {
}

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution590 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root == null)
            return list;
        if (root.children.size() != 0){
            for (Node node : root.children){
                postorder(node);
            }
        }
        list.add(root.val);
        return list;
    }
}