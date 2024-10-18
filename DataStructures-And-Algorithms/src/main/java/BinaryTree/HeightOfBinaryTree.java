package BinaryTree;

import BinaryTree.Util.Node;

public class HeightOfBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println("Height of the tree is: " + findHeight(root));
    }

    private static int findHeight(Node root) {
        if(root == null){
            return 0;
        }
        return Math.max(findHeight(root.left), findHeight(root.right))+1;
    }
}
