import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

class BinarySearchNode {
    public int key;
    public int value;
    public BinarySearchNode left;
    public BinarySearchNode right;

    public BinarySearchNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class Test3_27_1 {
    // 通过 root 表示树的根节点
    // 空树就使用 null 来表示
    private BinarySearchNode root = null;

    // 这个方法用于根据 key 来找 value
    public Integer get(int key) {
        BinarySearchNode cur = root;
        while (cur != null) {
            if (key < cur.key) {
                cur = cur.left;
            } else if (key > cur.key) {
                cur = cur.right;
            } else {
                // key 相等, 找到了
                return cur.value;
            }
        }
        return null;
    }

    // 这个方法用于插入新节点
    public void put(int key, int value) {
        // 1. 如果当前树是空树, 就把这个新节点作为根节点即可
        if (root == null) {
            root = new BinarySearchNode(key, value);
            return;
        }
        // 2. 树不为空的情况, 就需要找到该节点要放到哪个位置上
        //    查找的过程我们需要时刻记录父节点的位置.
        BinarySearchNode cur = root;
        // 保证 parent 时刻指向 cur 的父节点
        BinarySearchNode parent = null;
        while (cur != null) {
            if (key < cur.key) {
                // 往左子树找位置
                parent = cur;
                cur = cur.left;
            } else if (key > cur.key) {
                // 往右子树找位置
                parent = cur;
                cur = cur.right;
            } else {
                // key 相等. 就在这个树上找到了一个重复的 key
                // 修改 value 即可~~
                cur.value = value;
                return;
            }
        }
        // 当 while 循环结束的时候, 说明 cur 已经是 null
        // 也就找到合适的插入位置了. 就是把当前节点插入到 parent
        // 这个节点的子树上即可~~
        // 新节点应该是 parent 的左子树还是右子树呢?
        // 拿着新节点的 key 和 parent 的 key 再比较一次即可
        BinarySearchNode newNode = new BinarySearchNode(key, value);
        if (newNode.key < parent.key) {
            // 插入到 parent 的左边
            parent.left = newNode;
        } else {
            // 插入到 parent 的右边
            parent.right = newNode;
        }
    }

    // 这个方法用于删除节点
    public void remove(int key) {
        // 1. 先查找这个 key 对应的节点是哪个.
        //    这里的查找也需要记录 parent 的位置
        BinarySearchNode cur = root;
        BinarySearchNode parent = null;
        while (cur != null) {
            if (key < cur.key) {
                // 往左子树中找
                parent = cur;
                cur = cur.left;
            } else if (key > cur.key) {
                // 往右子树中找
                parent = cur;
                cur = cur.right;
            } else {
                // 相等, cur 节点就是待删除的节点~~
                // 2. 使用 removeNode 方法来完成具体的删除节点的过程
                removeNode(parent, cur);
                return;
            }
        }  // end while (cur != null)
    }  // end remove

    // 思考一下, 这个方法是否应该被外面的代码使用
    // removeNode 方法只应该由 remove 方法来使用, 不应该给别人用了
    private void removeNode(BinarySearchNode parent, BinarySearchNode cur) {
        if (cur.left == null) {
            // 1. 要删除的节点没有左子树
            if (cur == root) {
                // 1.1 待删除节点是根节点
                root = cur.right;
            } else if (cur == parent.right) {
                // 1.2 cur 不是根节点, 并且是父亲的右子树
                parent.right = cur.right;
            } else if (cur == parent.left) {
                // 1.3 cur 不是根节点, 并且是父亲的左子树
                parent.left = cur.right;
            }
        } else if (cur.right == null) {
            // 2. 要删除的节点没有右子树
            if (cur == root) {
                // 2.1 要删除的节点是根节点
                root = cur.left;
            } else if (cur == parent.right) {
                // 2.2 要删除的节点不是根节点, 且是父亲的右子树
                parent.right = cur.left;
            } else if (cur == parent.left) {
                // 2.3 要删除的节点不是根节点, 且是父亲的左子树
                parent.left = cur.left;
            }
        } else {
            // 3. 要删除的节点左右子树都有
            // a) 先在右子树中, 找到最小值, 也要记录这个最小值的父节点
            BinarySearchNode goat = cur.right;
            BinarySearchNode goatParent = cur;
            while (goat.left != null) {
                goatParent = goat;
                goat = goat.left;
            }
            // 当循环结束的时候, goat 就指向了右子树中的最小值
            // 最小值这个节点的特点就是 left 为 null
            // b) 就把替罪羊节点的值赋给待删除节点
            cur.key = goat.key;
            cur.value = goat.value;
            // 赋值操作完成后, 原来的待删除节点的内容就没了~~
            // 同时 goat 节点也就失去了利用价值, 可以干掉了
            // 干掉 goat 的时候需要知道 goat 是父亲的左子树还是右子树
            if (goat == goatParent.left) {
                goatParent.left = goat.right;
            } else {
                goatParent.right = goat.right;
            }
        }
    }
}
