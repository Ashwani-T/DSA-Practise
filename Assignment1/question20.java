package DSA_GATE.Assignment1;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class question20 {
    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = height(root.left);
        int rightDepth = height(root.right);

        
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.right.left=new TreeNode(6);
        root.right.right.right=new TreeNode(7);

        System.out.println("Height of tree is:"+height(root));
    }
}
