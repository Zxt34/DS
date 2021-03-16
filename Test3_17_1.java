import javax.xml.namespace.QName;
import java.util.LinkedList;
import java.util.Queue;

public class Test3_17_1 {
    public static void levelOrder(TreeNode root) {
        if(root == null){
            return;
        }
        Queue<TreeNode> res = new LinkedList<>();
        res.offer(root);
        while(true){
            TreeNode cur = res.poll();
            if(cur == null){
                break;
            }
            System.out.println(cur.val);
            if(cur.left != null){
                res.offer(cur.left);
            }
            if(cur.right != null){
                res.offer(cur.right);
            }
        }
    }

    public static boolean isCompleteTree(TreeNode root) {
        if(root == null){
            return true;
        }
        boolean isLevel2 = false;
        Queue<TreeNode> res = new LinkedList<>();
        res.offer(root);
        while(true){
            TreeNode cur = res.poll();
            if(cur == null){
                break;
            }
            if(!isLevel2){
                if(cur.left != null && cur.right != null){
                    res.offer(cur.left);
                    res.offer(cur.right);
                }else if(cur.left != null && cur.right == null){
                    isLevel2 = true;
                    res.offer(cur.left);
                }else if(cur.left == null && cur.right == null){
                    isLevel2 = true;
                }else{
                    return false;
                }
            }else{
                if(cur.left != null || cur.right != null){
                    return false;
                }
            }
        }
        return true;
    }

    public static TreeNode build() {
        TreeNode a = new TreeNode("1");
        TreeNode b = new TreeNode("2");
        TreeNode c = new TreeNode("3");
        TreeNode d = new TreeNode("4");
        TreeNode e = new TreeNode("5");
        TreeNode f = new TreeNode("6");
        TreeNode g = new TreeNode("7");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }

    public static void main(String[] args) {
        TreeNode root = build();
        levelOrder(root);
    }
}