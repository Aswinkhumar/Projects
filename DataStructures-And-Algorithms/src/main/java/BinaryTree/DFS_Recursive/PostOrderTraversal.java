package BinaryTree.DFS_Recursive;

import BinaryTree.Util.Node;

/*
Post-Order traversal is a type of Depth-First Search.
 */
public class PostOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        // Post-Order Traversal: left -> right -> root
        traversePostOrder(root);
    }

    private static void traversePostOrder(Node root) {
        if(root == null){
            return;
        }
        traversePostOrder(root.left);
        traversePostOrder(root.right);
        System.out.print(root.key + " ");
    }
}
