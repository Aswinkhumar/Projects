package BinaryTree.DFS_Recursive;

import BinaryTree.Util.Node;

/*
Pre-Order Traversal is a type of Depth-First Search.
 */
public class PreOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        // Pre-Order traversal: root -> left -> right
        traversePreOrder(root);
    }

    private static void traversePreOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.key + " ");
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }
}
