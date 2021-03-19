import java.util.ArrayList;
import java.util.List;

public class Test3_19_3 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    List<List<Integer>> res = null;
    public List<List<Integer>> levelOrder(TreeNode root) {
        res = new ArrayList<>();
        if(root == null){
            return res;
        }
        helper(root,0);
        return res;
    }

    public void helper(TreeNode root, int level){
        if(level == res.size()){
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if(root.left != null){
            helper(root.left,level + 1);
        }
        if(root.right != null){
            helper(root.right,level + 1);
        }
    }
}