package BinaryTree.DFS_Iterative;

import BinaryTree.Util.Node;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreOrderTraversalIterative {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        printPreOrder(root);
    }

    private static void printPreOrder(Node root) {
        Deque<Node> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                System.out.print(root.key + " ");
                root = root.left;
            }
            root = stack.pop();
            root = root.right;

        }
    }
}
