class TreeNode{
    String val;
    TreeNode left;
    TreeNode right;

    public TreeNode(String val) {
        this.val = val;
    }
}

public class Tree {
    public static TreeNode build(){
        TreeNode a = new TreeNode("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        TreeNode d = new TreeNode("D");
        TreeNode e = new TreeNode("E");
        TreeNode f = new TreeNode("F");
        TreeNode g = new TreeNode("G");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }

    // 先序遍历
    public static void preOrder(TreeNode root) {
        if(root == null){
            return;
        }
        System.out.println(root);
        preOrder(root.left);
        preOrder(root.right);
    }

    // 中序遍历
    public static void inOrder(TreeNode root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root);
        inOrder(root.right);
    }

    // 后序遍历
    public static void postOrder(TreeNode root) {
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root);
    }

    // 使用成员变量 count 记录元素的个数
    public static int count = 0;
    public static void length(TreeNode root) {
        if(root == null){
            return;
        }
        count++;
        length(root.left);
        length(root.right);
    }

    // 通过方法的返回值来实现 length
    public static int length1(TreeNode root) {
        if(root == null){
            return 0;
        }
        return 1 + length1(root.left) + length1(root.right);
    }

    // 求叶子结点个数
    public static int leafSize = 0;
    public static void getLeafSize(TreeNode root) {
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            leafSize++;
        }
        getLeafSize(root.left);
        getLeafSize(root.right);
    }

    // 通过返回值求叶子结点个数
    public static int getLeafSize1(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return getLeafSize1(root.left) + getLeafSize1(root.right);
    }

    // 求第 k 层结点数
    public static int getKLevelSize(TreeNode root, int k) {
        if(root == null || k < 1){
            return 0;
        }
        if(k == 1){
            return 1;
        }
        return getKLevelSize(root.left,k - 1) + getKLevelSize(root.right,k - 1);
    }

    // 求树的深度
    public static int getHeight(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
    }

    // 查找元素
    public static TreeNode find(TreeNode root, String toFind) {
        if(root == null){
            return null;
        }
        if(root.val.equals(toFind)){
            return root;
        }
        TreeNode res = find(root.left,toFind);
        if(res != null){
            return res;
        }
        return find(root.right,toFind);
    }

    public static void main(String[] args) {
        TreeNode root = build();
//        preOrder(root);
//        inOrder(root);
//        postOrder(root);
//        length(root);
//        System.out.println(count);
//        System.out.println(length2(root));
//        getLeafSize(root);
//        System.out.println(leafSize);
//        System.out.println(getLeafSize2(root));
//        System.out.println(getKLevelSize(root, 3));
        System.out.println(getHeight(root));
    }
}