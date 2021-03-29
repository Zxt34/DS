import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

public class BinarySearchTree {
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

        private BinarySearchNode root = null;

        public Integer get(int key) {
            BinarySearchNode cur = root;
            while (cur != null) {
                if (key < cur.key) {
                    cur = cur.left;
                } else if (key > cur.key) {
                    cur = cur.right;
                } else {
                    return cur.value;
                }
            }
            return null;
        }
        
        public void put(int key, int value) {
            if (root == null) {
                root = new BinarySearchNode(key, value);
                return;
            }
            BinarySearchNode cur = root;
            BinarySearchNode parent = null;
            while (cur != null) {
                if (key < cur.key) {
                    parent = cur;
                    cur = cur.left;
                } else if (key > cur.key) {
                    parent = cur;
                    cur = cur.right;
                } else {
                    cur.value = value;
                    return;
                }
            }
            BinarySearchNode newNode = new BinarySearchNode(key, value);
            if (newNode.key < parent.key) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        }

        public void remove(int key) {
            BinarySearchNode cur = root;
            BinarySearchNode parent = null;
            while (cur != null) {
                if (key < cur.key) {
                    parent = cur;
                    cur = cur.left;
                } else if (key > cur.key) {
                    parent = cur;
                    cur = cur.right;
                } else {
                    removeNode(parent, cur);
                    return;
                }
            }
        }

        private void removeNode(BinarySearchNode parent, BinarySearchNode cur) {
            if (cur.left == null) {
                if (cur == root) {
                    root = cur.right;
                } else if (cur == parent.right) {
                    parent.right = cur.right;
                } else if (cur == parent.left) {
                    parent.left = cur.right;
                }
            } else if (cur.right == null) {
                if (cur == root) {
                    root = cur.left;
                } else if (cur == parent.right) {
                    parent.right = cur.left;
                } else if (cur == parent.left) {
                    parent.left = cur.left;
                }
            } else {
                BinarySearchNode goat = cur.right;
                BinarySearchNode goatParent = cur;
                while (goat.left != null) {
                    goatParent = goat;
                    goat = goat.left;
                }
                cur.key = goat.key;
                cur.value = goat.value;
                if (goat == goatParent.left) {
                    goatParent.left = goat.right;
                } else {
                    goatParent.right = goat.right;
                }
            }
        }
    }