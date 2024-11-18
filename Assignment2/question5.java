package DSA_GATE.Assignment2;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class Solution {
    
    boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    
    private int checkHeight(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(60);

        Solution solution = new Solution();
        if (solution.isBalanced(root)) {
            System.out.println("1"); 
        } else {
            System.out.println("0"); 
        }
    }
}

