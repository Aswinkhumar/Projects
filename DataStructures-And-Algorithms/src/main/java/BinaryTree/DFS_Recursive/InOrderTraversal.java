package BinaryTree.DFS_Recursive;

import BinaryTree.Util.Node;

/*
InOrder Traversal is a type of Depth-First Search.
 */
public class InOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        // In-Order traversal: left -> root -> right
        traverseInOrder(root);
    }

    private static void traverseInOrder(Node root) {
        if(root == null){
            return;
        }
        traverseInOrder(root.left);
        System.out.print(root.key+ " ");
        traverseInOrder(root.right);
    }
}
