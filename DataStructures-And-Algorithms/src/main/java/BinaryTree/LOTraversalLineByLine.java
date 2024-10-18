package BinaryTree;

import BinaryTree.Util.Node;

import java.util.*;

public class LOTraversalLineByLine {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        //lineByLine1(root);
        lineByLine2(root);
    }

    private static void lineByLine2(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                Node current = queue.poll();
                System.out.print(current.key + " ");
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            System.out.println();
        }
    }

    private static void lineByLine1(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (queue.size() > 1){
            Node current = queue.poll();
            if(current == null){
                System.out.println();
                queue.add(null);
                continue;
            }
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
