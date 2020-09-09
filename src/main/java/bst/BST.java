package bst;

//https://algorithms.tutorialhorizon.com/top-25-problems-on-binary-trees-binary-search-trees/

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.max;

public class BST {

    Node root;
    int sum = 0;

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insertItem(8);
        bst.insertItem(3);
        bst.insertItem(10);
        bst.insertItem(1);
        bst.insertItem(6);
        bst.insertItem(14);
        bst.insertItem(4);
        bst.insertItem(7);
        bst.insertItem(13);

        System.out.print("PreOrderTraversal : ");
        bst.preOrderTraversal(bst.root);
        System.out.print("\nInOrderTraversal : ");
        bst.inOrderTraversal(bst.root);
        System.out.print("\nPostOrderTraversal : ");
        bst.postOrderTraversal(bst.root);
        System.out.print("\nLevelOrderTraversal : ");
        bst.levelOrderTraversal(bst.root);
        System.out.print("\nLevelReverseOrderTraversal : ");
        bst.levelReverseOrderTraversal(bst.root);
        System.out.print("\nLeftView : ");
        bst.printLeftView(bst.root);
        System.out.print("\nRightView : ");
        bst.printRightView(bst.root);
        System.out.println();
        bst.leafSum(bst.root);
        System.out.println("Leaf Sum : " + bst.sum);

        System.out.println("IsBst : " + bst.isBST(bst.root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        System.out.println("Height : " + bst.height(bst.root));

        bst.maxSum(bst.root, 0);
        System.out.println("Maximum Sum Leaf to Root path " + maxSum);

        System.out.print("Path :");
        bst.path(bst.root, maxLeaf);

        System.out.println("\nSortedArrayToBst");
        int [] arrA = {2,3,6,7,8,9,12,15,16,18,20};
        bst.sortedArrayToBst(arrA, 0, arrA.length-1);
        bst.showAll(bst.root);

        System.out.println("\n---Balanced Tree : A tree where no leaf is much farther away from the root than any other leaf. ");
        System.out.println("IsBalancedTree : "+ isBalancedNaive(bst.root));

        System.out.println("Find path which has sum equal to give value");
        bst.hasPath(bst.root, 11, "");

        System.out.println("Print all paths from root to leaf");
        int [] path = new int [100];
        bst.printPaths(bst.root, path, 0);
    }


    public class Node {
        Node lc;
        Node rc;
        int data;
    }

    public void insertItem(int data) {

        Node newNode = new Node();
        newNode.lc = null;
        newNode.rc = null;
        newNode.data = data;

        if (root == null) {
            root = newNode;
            return;
        }

        Node p = root;
        Node c = root;

        while (c != null) {
            p = c;
            if (data < c.data) {
                c = c.lc;
            } else {
                c = c.rc;
            }
        }

        if (data < p.data) {
            p.lc = newNode;
        } else {
            p.rc = newNode;
        }
    }

    private void preOrderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.lc);
        preOrderTraversal(root.rc);
    }

    private void inOrderTraversal(Node root) {
        if (root == null) return;
        preOrderTraversal(root.lc);
        System.out.print(root.data + " ");
        preOrderTraversal(root.rc);
    }

    private void postOrderTraversal(Node root) {
        if (root == null) return;
        preOrderTraversal(root.lc);
        preOrderTraversal(root.rc);
        System.out.print(root.data + " ");
    }

    private void levelOrderTraversal(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.peek();
            System.out.print(current.data + " ");

            if (current.lc != null) {
                queue.add(current.lc);
            }
            if (current.rc != null) {
                queue.add(current.rc);
            }

            queue.remove();
        }

    }

    private void levelReverseOrderTraversal(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.peek();
            System.out.print(current.data + " ");

            if (current.rc != null) {
                queue.add(current.rc);
            }
            if (current.lc != null) {
                queue.add(current.lc);
            }

            queue.remove();
        }

    }

    private static void printLeftView(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // number of nodes at current level
            int n = queue.size();

            // Traverse all nodes of current level
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();

                // Print the right most element at
                // the level
                if (i == 1)
                    System.out.print(temp.data + " ");

                // Add left node to queue
                if (temp.lc != null)
                    queue.add(temp.lc);

                // Add right node to queue
                if (temp.rc != null)
                    queue.add(temp.rc);
            }
        }
    }

    private static void printRightView(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // number of nodes at current level
            int n = queue.size();

            // Traverse all nodes of current level
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();

                // Print the right most element at
                // the level
                if (i == n)
                    System.out.print(temp.data + " ");

                // Add left node to queue
                if (temp.lc != null)
                    queue.add(temp.lc);

                // Add right node to queue
                if (temp.rc != null)
                    queue.add(temp.rc);
            }
        }
    }


    private void leafSum(Node root) {
        if (root == null) return;
        if (root.lc == null && root.rc == null) {
            sum = sum + root.data;
        }
        leafSum(root.lc);
        leafSum(root.rc);
    }

    private boolean isBST(Node root, int min, int max) {
        if (root == null) return true;
        if (root.data <= min || root.data > max) {
            return false;
        }
        return isBST(root.lc, min, root.data) && isBST(root.rc, root.data, max);
    }

    private static int height(Node root) {
        if (root == null) return 0;
        int leftHeight = height(root.lc);
        int rightHeight = height(root.rc);
        return 1 + max(leftHeight, rightHeight);
    }

    static int maxSum = Integer.MIN_VALUE;
    static Node maxLeaf = null;
    static int currentSum = 0;

    private void maxSum(Node root, int sum) {
        if (root != null) {
            sum = sum + root.data;
            if (sum > maxSum && root.lc == null && root.rc == null) {
                maxLeaf = root;
                maxSum = sum;
            }
            //	System.out.println("Sum " + sum);
            maxSum(root.lc, sum);
            maxSum(root.rc, sum);
        }
    }

    private Boolean path(Node root, Node leaf) {
        if (root == null) return false;
        if ((root == leaf) || path(root.lc, leaf) || path(root.rc, leaf)) {
            System.out.print(" " + root.data);
            return true;
        }
        return false;
    }

    private Node sortedArrayToBst(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node();
        root.data = arr[mid];
        root.lc = sortedArrayToBst(arr, start, mid - 1);
        root.rc = sortedArrayToBst(arr, mid + 1, end);
        return root;
    }

    private void showAll(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        showAll(root.lc);
        showAll(root.rc);
    }

    private static boolean isBalancedNaive(Node root){
        if(root==null)return true;
        int heightDifference = height(root.lc)-height(root.rc);
        if(Math.abs(heightDifference)>1){
            return false;
        }else{
            return isBalancedNaive(root.lc) && isBalancedNaive(root.rc);
        }
    }

    private void hasPath(Node root, int sum, String path){
        if(root!=null){
            if(root.data>sum){ // if root is greater than Sum required, return
                return;
            }else{
                path+=" " + root.data; //add root to path
                sum=sum-root.data; // update the required sum
                if(sum==0){ //if sum required =0, means we have found the path
                    System.out.println(path);
                }
                hasPath(root.lc, sum, path);
                hasPath(root.rc, sum, path);
            }
        }
    }

    //Print all paths from root to leaf

    int [] paths = new int[500];
    int pathLength =0;
    private void printPaths(Node root, int [] path, int pathLen){
        if(root==null){
            return;
        }
        path[pathLen++]= root.data;
        if(root.lc==null && root.rc==null){
            print(path,pathLen);
        }
        else{
            printPaths(root.lc,path,pathLen);
            printPaths(root.rc,path,pathLen);
        }
    }
    private void print(int [] path, int pathLen){
        for(int i=0;i<pathLen;i++){
            System.out.print(path[i]+ " ");
        }
        System.out.println();
    }


}