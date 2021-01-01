package bst;

import binaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    public static void invertBinaryTree(Node root)
    {
        // base case: if tree is empty
        if (root == null) {
            return;
        }

        // maintain a queue and push push root node
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        // loop till queue is empty
        while (!q.isEmpty())
        {
            // pop top node from queue
            Node curr = q.poll();

            // swap left child with right child
            swap(curr);

            // push left child of popped node to the queue
            if (curr.left != null) {
                q.add(curr.left);
            }

            // push right child of popped node to the queue
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }

    public static void swap(Node root) {
        if (root == null) {
            return;
        }

        Node temp = root.left;
        root.left =  root.right;
        root.right = temp;
    }
}
