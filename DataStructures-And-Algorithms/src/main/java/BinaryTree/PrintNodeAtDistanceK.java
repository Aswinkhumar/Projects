package BinaryTree;

import BinaryTree.Util.Node;

public class PrintNodeAtDistanceK {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        int k = 0;
        printNodes(root,k);
    }

    private static void printNodes(Node root, int k) {
        if(k == 0){
            System.out.print(root.key + " ");
        }
        if(root == null){
            if(k > 0){
                System.out.println("No Nodes found at "+k+"th level ");
            }
            return;
        }
        printNodes(root.left, k-1);
        printNodes(root.right, k-1);
    }
}
