public class Test3_19_1 {
    /**
     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }
     */
        public TreeNode Convert(TreeNode pRootOfTree) {
            if(pRootOfTree == null){
                return null;
            }
            if(pRootOfTree.left == null && pRootOfTree.right == null){
                return pRootOfTree;
            }
            TreeNode leftHead = Convert(pRootOfTree.left);
            TreeNode leftTail = leftHead;
            while(leftTail != null && leftTail.right != null){
                leftTail = leftTail.right;
            }
            if(leftTail != null){
                pRootOfTree.left = leftTail;
                leftTail.right = pRootOfTree;
            }
            TreeNode rightHead = Convert(pRootOfTree.right);
            if(rightHead != null){
                pRootOfTree.right = rightHead;
                rightHead.left = pRootOfTree;
            }
            return leftHead != null ? leftHead : pRootOfTree;
        }
}