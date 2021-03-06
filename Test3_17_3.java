public class Test3_17_3 {
        public boolean isBalanced(TreeNode root) {
            if(root == null){
                return true;
            }
            if(root.left == null && root.right == null){
                return true;
            }
            if(getHeight(root.left) - getHeight(root.right) > 1 || getHeight(root.left) - getHeight(root.right) < -1){
                return false;
            }
            return isBalanced(root.left) && isBalanced(root.right);
        }

        public int getHeight(TreeNode root) {
            if(root == null){
                return 0;
            }
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
        }
    }