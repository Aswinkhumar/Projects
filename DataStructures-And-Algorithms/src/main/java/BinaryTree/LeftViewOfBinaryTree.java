package BinaryTree;

import BinaryTree.Util.Node;

import java.util.ArrayDeque;
import java.util.Queue;

public class LeftViewOfBinaryTree {
    static int maxLevel = -1; // To maintain the maxLevel we have reached so far.
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        //printLeftView(root);
        printLeftViewPreOrder(root,0);
    }
    /*
    Implementation using pre-order traversal.
     */
    private static void printLeftViewPreOrder(Node root, int level) {
        if(root == null){
            return;
        }
        if(maxLevel < level){
            System.out.print(root.key + " ");
            maxLevel = level;
        }
        printLeftViewPreOrder(root.left,level+1);
        printLeftViewPreOrder(root.right, level+1);
    }

    private static void printLeftView(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int count = queue.size();
            for (int i = 0; i < count; i++)
            {
                Node current = queue.poll();
                if(i == count-1) {
                    System.out.print(current.key + " ");
                }
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
        }
    }
}
