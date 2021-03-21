import java.util.Stack;

public class Test3_21_4 {
    static class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void preOrderNoR(TreeNode root) {
        if(root == null){
            return;
        }
        Stack<TreeNode> res = new Stack<>();
        res.push(root);
        while(!res.isEmpty()){
            TreeNode cur = res.pop();
            System.out.println(cur.val);
            if(root.right != null){
                res.push(root.right);
            }
            if(root.left != null){
                res.push(root.left);
            }
        }
    }

    public static void inOrderNoR(TreeNode root) {
        Stack<TreeNode> res = new Stack<>();
        TreeNode cur = root;
        while(true){
            while(cur != null){
                res.push(cur);
                cur = cur.left;
            }
            if(res.isEmpty()){
                break;
            }
            TreeNode top = res.pop();
            System.out.println(top.val);
            cur = cur.right;
        }
    }

    public static void postOrderNoR(TreeNode root) {
        if(root == null){
            return;
        }
        Stack<TreeNode> res = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while(true){
            while(cur != null){
                res.push(cur);
                cur = cur.left;
            }
            if(res.isEmpty()){
                break;
            }
            TreeNode top = res.peek();
            if(top.right == null || prev == top.right){
                System.out.println(top.val);
                res.pop();
                prev = top;
            }else{
                cur = top.right;
            }
        }
    }

    public StringBuffer stringBuffer = null;
    public String tree2str(TreeNode t) {
        stringBuffer = new StringBuffer();
        if(t == null){
            return "";
        }
        _tree2str(t);
        stringBuffer.deleteCharAt(0);
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return stringBuffer.toString();
    }

    public void _tree2str(TreeNode root) {
        if (root == null) {
            return;
        }
        stringBuffer.append("(");
        stringBuffer.append(root.val);
        _tree2str(root.left);
        if(root.left == null && root.right != null){
            stringBuffer.append("()");
        }
        _tree2str(root.right);
        stringBuffer.append(")");
    }
}