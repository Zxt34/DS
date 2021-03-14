import java.util.ArrayList;
import java.util.List;

class Treenode {
     int val;
     Treenode left;
     Treenode right;

     Treenode(int val) {
         this.val = val;
     }
 }

public class Test3_14_3 {
    public List<Integer> preorderTraversal(Treenode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }

    public List<Integer> inorderTraversal(Treenode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        // 递归处理左子树
        result.addAll(inorderTraversal(root.left));
        // 访问根节点
        result.add(root.val);
        // 递归处理右子树
        result.addAll(inorderTraversal(root.right));
        return result;
    }
}