class Node {
    char val;
    Node left;
    Node right;

    public Node(char val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}

public class BinaryTree {
    // 创建一个树
    public static Node build(){
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');

        a.left = b;
        b.left = d;
        b.right = e;
        e.left = g;
        a.right = c;
        c.right = f;
        return a;
    }

    // 先序遍历：
    public static void preOrder(Node root){
        if (root == null)
            return;

        // 访问根节点
        System.out.print(root.val);
        // 递归遍历左子树
        preOrder(root.left);
        // 递归遍历右子树
        preOrder(root.right);
    }

    // 中序遍历：
    public static void inOrder(Node root){
        if (root == null)
            return;

        // 递归处理左子树
        inOrder(root.left);
        // 根节点
        System.out.print(root.val);
        // 递归处理右子树
        inOrder(root.right);
    }

    // 后续遍历：
    public static void postOrder(Node root){
        if (root == null)
            return;

        // 递归处理左子树
        preOrder(root.left);
        // 递归处理右子树
        preOrder(root.right);
        // 根节点
        System.out.print(root.val);
    }

    // 求二叉树结点的个数：
    public static int count = 0;
    public static void nodeCount(Node root){
        if (root == null)
            return;

        // 访问根节点
        count++;
        // 递归处理左子树
        nodeCount(root.left);
        // 递归处理右子树
        nodeCount(root.right);
    }

    // 求二叉树节点个数（通过方法返回值）
    public static int nodeCount2(Node root){
        if (root == null)
            return 0;

        return 1 + nodeCount2(root.left) + nodeCount2(root.right);
    }

    // 求二叉树叶子结点的个数
    public static int lesfSize = 0;
    public static void getLeafSize(Node root){
        if (root == null)
            return;

        // 判断当前节点是否是叶子结点
        if (root.left == null && root.right == null){
            lesfSize++;
        }
        getLeafSize(root.left);
        getLeafSize(root.right);
    }


    // 求二叉树叶子结点的个数(通过返回值)
    public static int getLeafSize2(Node root){
        if (root == null)
            return 0;

        // 判断当前节点是否是叶子结点
        if (root.left == null && root.right == null){
            return 1;
        }

        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    // 求第 k 层节点的个数
    public static int getKLevelSize(Node root, int k){
        if (root == null)
            return 0;

        if (k == 1)
            return 1;

        return getKLevelSize(root.left,k-1) + getKLevelSize(root.right,k-1);
    }


    // 求二叉树的高度
    public static int getHeight(Node root){
        if (root == null)
            return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
    }

    // 查找树上的某个元素
    public static Node findNode(Node root, char toFind){
        if (root == null)
            return null;

        if (root.val == toFind)
            return root;

        Node ret = findNode(root.left,toFind);
        if (ret != null){
            return ret;
        }
        return findNode(root.right,toFind);
    }


    public static void main(String[] args) {
        Node root = build();

        System.out.print("先序遍历：");
        preOrder(root);
        System.out.print("\n中序遍历：");
        inOrder(root);
        System.out.print("\n后序遍历：");
        postOrder(root);

        nodeCount(root);
        System.out.println("\n节点个数："+count);

        getLeafSize(root);
        System.out.println("叶子结点数："+lesfSize);

        System.out.println("树的高度为："+getLeafSize2(root));

        System.out.println("查找结点 D ："+findNode(root,'D').toString());

    }
}
