class BinaryNode {
    public int key;
    public int value;
    public BinaryNode left;
    public BinaryNode right;

    public BinaryNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
public class BinarySearchTree {
    private BinaryNode root = null;

    // 1.查找
    public Integer get(int key){
        BinaryNode cur = root;
        while (cur != null){
            if (key < cur.key){
                cur = cur.left;
            }else if(key > cur.key){
                cur = cur.right;
            }else{
                return cur.value;
            }
        }
        return null;
    }

    // 2.插入
    public void put(int key, int value){
        if (root == null){
            root = new BinaryNode(key,value);
            return;
        }

        BinaryNode cur = root;
        BinaryNode parent = null;
        while (cur != null){
            if (key < cur.key){
                parent = cur;
                cur = cur.left;
            }else if(key > cur.key){
                parent = cur;
                cur = cur.right;
            }else {
                cur.value = value;
                return;
            }
        }
        // 循环结束， cur 为空，说明已经找到要插入的位置
        BinaryNode node = new BinaryNode(key,value);
        if (node.key < parent.key){
            parent.left = node;
        }else {
            parent.right = node;
        }
    }

    // 3.删除
    public void remove(int key){
        // 1.先查找删除节点的位置
        BinaryNode cur = root;
        BinaryNode parent = null;
        while (cur != null){
            if (key < cur.key){
                parent = cur;
                cur = cur.left;
            }else if(key > cur.key){
                parent = cur;
                cur = cur.right;
            }else{
                // 找到该删除节点的位置
                removeNode(parent,cur);
            }
        }
        return;
    }
    // 当前 removeNode 方法只是给类自己的 remove 方法使用
    // 因此没有必要设置成 public
    private void removeNode(BinaryNode parent, BinaryNode cur){
        // 1.待删除的结点左子树为空
        if (cur.left == null){
            if (cur == root){
                // 1.1 待删除结点为根节点
                root = cur.right;
            }else if (cur == parent.left){
                // 1.2 待删除节点不是根节点，是父亲的左子树
                parent.left = cur.right;
            }else if (cur == parent.right){
                // 1.3
                parent.right = cur.right;
            }
        }else if (cur.right == null){
            // 2.待删除节点右子树为空
            if (cur == root){
                // 2.1
                root = cur.left;
            }else if (cur == parent.left){
                // 2.2
                parent.left = cur.left;
            }else if (cur == parent.right){
                // 2.3
                parent.right = cur.left;
            }
        }else {
            // 3.左右子树都存在
            // 右子树找到最小值 、 左子树找到最大值（替罪羊结点）
            BinaryNode goat = cur.right;
            BinaryNode goatParent = parent;
            while (goat.left != null){
                goatParent = goat;
                goat = goat.left;
            }
            cur.key = goat.key;
            cur.value = goat.value;
            // 删除替罪羊结点
            if (goat == cur.left){
                goatParent.left = goat.right;
            }else {
                goatParent.right = goat.right;
            }
        }
    }


}
