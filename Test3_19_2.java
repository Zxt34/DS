public class Test3_19_2 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public TreeNode lca = null;
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null){
                return null;
            }
            find(root,p,q);
            return lca;
        }

        public boolean find (TreeNode root, TreeNode p, TreeNode q) {
            if(root == null){
                return false;
            }
            int mid = (root == p || root == q) ? 1 : 0;
            int left = find(root.left,p,q) ? 1 : 0;
            int right = find(root.right,p,q) ? 1 : 0;
            if(mid + left + right == 2){
                lca = root;
            }
            return (mid + left + right > 0);
        }
}