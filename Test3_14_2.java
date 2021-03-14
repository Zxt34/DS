public class Test3_14_2 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null){
            return false;
        }
        boolean ret = isSameTree(s,t);
        if(ret){
            return ret;
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
}