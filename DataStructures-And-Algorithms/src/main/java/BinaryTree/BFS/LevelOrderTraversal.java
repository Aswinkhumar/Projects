package BinaryTree.BFS;

import BinaryTree.Util.Node;

import java.util.ArrayDeque;
import java.util.Queue;

/*
Level order traversal or Breadth-First search (BFS) is where we start from the root and travers down level by level.
 */
public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        leveOrderTraversal(root);
    }

    private static void leveOrderTraversal(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.key + " ");
            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }

        }
    }
}
