package BinaryTree;

// Có root để quản lý toàn bộ tree
public class MyBinaryTree {
    private TreeNode root;

    public MyBinaryTree() {
    }

//   public void init() {
//      TreeNode n0 = new TreeNode(0);
//      TreeNode n1 = new TreeNode(1);
//      TreeNode n2 = new TreeNode(2);
//      TreeNode n3 = new TreeNode(3);
//      TreeNode n4 = new TreeNode(4);
//      TreeNode n5 = new TreeNode(5);
//
//      n0.left = n1; n0.right = n2;
//      n1.left = n3; n1.right = n4;
//      n2.left = n5;
//
//      root = n0;
//   }

    public TreeNode insertNodeLoop(TreeNode root, int value) {
        TreeNode nodeInsert = new TreeNode(value);
        if (root == null) {
            root = new TreeNode(value);
        } else {
            TreeNode temp = root;
            while (true) {
                if (value > temp.value) {
                    if (temp.right == null) {
                        temp.right = nodeInsert;
                        break;
                    }
                    temp = temp.right;
                } else {
                    if (temp.left == null) {
                        temp.left = nodeInsert;
                        break;
                    }
                    temp = temp.left;
                }
            }
        }
        return root;
    }

    public TreeNode insertNodeRecursion(TreeNode root, int value) {
        if (root == null) return new TreeNode(value);
        if (value > root.value) {
            if (root.right == null) {
                root.right = new TreeNode(value);
            } else {
                insertNodeRecursion(root.right, value);
            }

        } else {
            if (root.left == null) {
                root.left = new TreeNode(value);
            } else {
                insertNodeRecursion(root.left, value);
            }
        }
        return root;
    }
}
