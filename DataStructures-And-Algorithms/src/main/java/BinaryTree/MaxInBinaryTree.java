package BinaryTree;

import BinaryTree.Util.Node;

public class MaxInBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println("Max in binary tree is " + findMax(root));
    }

    private static int findMax(Node root) {
        if(root == null) return 0;

        int leftKey = findMax(root.left);
        int rightKey = findMax(root.right);

        return Math.max(root.key,(Math.max(leftKey,rightKey)));
    }
}
