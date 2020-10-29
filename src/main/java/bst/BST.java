package bst;

//https://algorithms.tutorialhorizon.com/top-25-problems-on-binary-trees-binary-search-trees/

import java.util.*;

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
        System.out.print("\nDepthFirstSearch or Vertical Order Traversal : ");
        bst.DFS(bst.root);
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
        int[] arrA = {2, 3, 6, 7, 8, 9, 12, 15, 16, 18, 20};
        bst.sortedArrayToBst(arrA, 0, arrA.length - 1);
        bst.showAll(bst.root);

        System.out.println("\n---Balanced Tree : A tree where no leaf is much farther away from the root than any other leaf. ");
        System.out.println("IsBalancedTree : " + isBalancedNaive(bst.root));

        System.out.println("Find path which has sum equal to give value");
        bst.hasPath(bst.root, 11, "");

        System.out.println("Print all paths from root to leaf");
        int[] path = new int[100];
        bst.printPaths(bst.root, path, 0);

        System.out.println("Paths");
        bst.printPaths(bst.root, new ArrayList());

        boolean isPresent = bst.ifNodePresent(bst.root, 13);
        System.out.println("Node is present in bst : " + isPresent);

        System.out.println("Parent Node is " + bst.getParentNode(bst.root, 13).data);

        System.out.println("Sibling Node " + bst.getSiblingNode(bst.root, 1).data);

        System.out.println("Inorder Parent : " + bst.getInorderParent(bst.root, 13).data);

        System.out.println("MirrorTree");
        bst.inOrderTraversal(bst.root);
        System.out.println("----");
        Node mirror = bst.mirrorTree(bst.root);
        bst.inOrderTraversal(mirror);

        System.out.println("----LevelOrderTraversal----");
        bst.levelOrderTraversalUsingQueueLineByLine(bst.root);

        System.out.println("---Min Distance to Leaf---");
        System.out.println(bst.getMinDistanceToLeaf(bst.root));

        System.out.println("---Min Distance to Leaf---");
        System.out.println(bst.getMaxDistanceToLeaf(bst.root));

        System.out.println(bst.findLCA(bst.root, 1, 14).data);

        System.out.println("Distance between two nodes : " + bst.distanceBetweenTwoNodes(bst.root, 1, 4));

        System.out.println("Diameter of the tree : " + bst.getDiameter1(bst.root));

        System.out.println("Print Nodes at distance kth from node : ");
        bst.printNodesAtKthDistanceFromRoot(bst.root, 2);
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

    /**
     * Traversal
     */
    private void preOrderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.lc);
        preOrderTraversal(root.rc);
    }

    private void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.lc);
        System.out.print(root.data + " ");
        inOrderTraversal(root.rc);
    }

    private void postOrderTraversal(Node root) {
        if (root == null) return;
        postOrderTraversal(root.lc);
        postOrderTraversal(root.rc);
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

    //Depth First Search or vertical Order
    public void DFS(Node root) {
        Stack<Node> s = new Stack<Node>();
        s.add(root);
        while (!s.isEmpty()) {
            Node x = s.pop();
            if (x.rc != null) s.add(x.rc);
            if (x.lc != null) s.add(x.lc);
            System.out.print(" " + x.data);
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

    private void showAll(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        showAll(root.lc);
        showAll(root.rc);
    }

    private static boolean isBalancedNaive(Node root) {
        if (root == null) return true;
        int heightDifference = height(root.lc) - height(root.rc);
        if (Math.abs(heightDifference) > 1) {
            return false;
        } else {
            return isBalancedNaive(root.lc) && isBalancedNaive(root.rc);
        }
    }

    private void hasPath(Node root, int sum, String path) {
        if (root != null) {
            if (root.data > sum) { // if root is greater than Sum required, return
                return;
            } else {
                path += " " + root.data; //add root to path
                sum = sum - root.data; // update the required sum
                if (sum == 0) { //if sum required =0, means we have found the path
                    System.out.println(path);
                }
                hasPath(root.lc, sum, path);
                hasPath(root.rc, sum, path);
            }
        }
    }

    //Print all paths from root to leaf

    int[] paths = new int[500];
    int pathLength = 0;

    private void printPaths(Node root, int[] path, int pathLen) {
        if (root == null) {
            return;
        }
        path[pathLen++] = root.data;
        if (root.lc == null && root.rc == null) {
            print(path, pathLen);
        } else {
            printPaths(root.lc, path, pathLen);
            printPaths(root.rc, path, pathLen);
        }
    }

    private void print(int[] path, int pathLen) {
        for (int i = 0; i < pathLen; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println();
    }

    public void printPaths(Node root, ArrayList arr) {
        if (root == null) {
            return;
        }
        arr.add(root.data);

        if (root.lc == null && root.rc == null) {
            System.out.println(arr);
        } else {
            printPaths(root.lc, arr);
            printPaths(root.rc, arr);
        }

        arr.remove(arr.size() - 1);
    }

    public boolean ifNodePresent(Node node, int val) {
        if (node == null) {
            return false;
        }

        boolean isPresent = false;

        while (node != null) {
            if (val < node.data) {
                node = node.lc;
            } else if (val > node.data) {
                node = node.rc;
            } else {
                isPresent = true;
                break;
            }
        }

        return isPresent;
    }

    public Node getParentNode(Node node, int val) {
        if (node == null) {
            return null;
        }

        Node getParent = null;

        while (node != null) {
            if (val < node.data) {
                getParent = node;
                node = node.lc;
            } else if (val > node.data) {
                getParent = node;
                node = node.rc;
            } else {
                break;
            }
        }

        return getParent;
    }

    public Node getSiblingNode(Node node, int val) {
        if (node == null || node.data == val) {
            return null;
        }

        Node parentNode = null;

        while (node != null) {
            if (val < node.data) {
                parentNode = node;
                node = node.lc;
            } else if (val > node.data) {
                parentNode = node;
                node = node.rc;
            } else {
                break;
            }
        }

        if (parentNode.lc != null && val == parentNode.lc.data) {
            return parentNode.rc;
        }

        if (parentNode.rc != null && val == parentNode.rc.data) {
            return parentNode.lc;
        }

        return null;
    }

    public Node getInorderParent(Node node, int val) {
        if (node == null) {
            return null;
        }

        Node inorderParent = null;

        while (node != null) {
            if (val < node.data) {
                inorderParent = node;
                node = node.lc;
            } else if (val > node.data) {
                node = node.rc;
            } else {
                break;
            }
        }

        return node != null ? inorderParent : null;
    }

    public int getMax(Node node) {
        if (node == null) {
            System.out.println("Tree is EMpty");
            return -1;
        }

        while (node.rc != null) {
            node = node.rc;
        }

        return node.data;
    }

    public int getMin(Node node) {
        if (node == null) {
            System.out.println("Tree is EMpty");
            return -1;
        }

        while (node.lc != null) {
            node = node.lc;
        }

        return node.data;
    }

    public boolean ifPairExistsUtil(Node node, int sum, HashSet<Integer> set) {
        if (node == null) {
            return false;
        }

        if (set.contains(sum - node.data)) {
            return true;
        }

        set.add(node.data);

        if (ifPairExistsUtil(node.lc, sum, set)) {
            return true;
        }

        return ifPairExistsUtil(node.rc, sum, set);
    }

    int countElement = 0;

    public Node getKthSmallestElementBST(Node node, int k) {
        if (node == null) {
            return null;
        }

        Node left = getKthSmallestElementBST(node.lc, k);

        if (left != null) {
            return left;
        }

        countElement++;
        if (countElement == k) {
            return node;
        }

        return getKthSmallestElementBST(node.rc, k);
    }

    int countLargesElement = 0;

    /**
     * @param node
     * @param k
     * @return Solution
     * - Traverse BST in inorder manner from right to left
     * - Create a count variable
     * - We increase count when we hit a node
     * - We check if count is equal to k, then that is out kth largest element
     * - If node is returning null, then k is greater then total node size
     */
    public Node getKthLargestElementBST(Node node, int k) {
        if (node == null) {
            return null;
        }

        Node right = getKthLargestElementBST(node.rc, k);

        if (right != null) {
            return right;
        }

        countLargesElement++;
        if (countLargesElement == k) {
            return node;
        }

        return getKthLargestElementBST(node.lc, k);
    }

    /**
     * Solution:
     * - We need to check the value of both trees node at a time & then recursively call for remaining nodes
     * - Recursively check left of 1st tree with right of 2nd tree & similarily right of 1st tree with left of 2nd tree
     */
    public boolean ifMirrorTree(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        return node1.data == node2.data
                && ifMirrorTree(node1.lc, node2.rc)
                && ifMirrorTree(node1.rc, node2.lc);
    }

    public Node mirrorTree(Node node) {
        if (node == null) {
            return null;
        }

        Node t = node.lc;
        node.lc = node.rc;
        node.rc = t;

        mirrorTree(node.lc);
        mirrorTree(node.rc);

        return node;
    }

    public void levelOrderTraversalUsingQueueLineByLine(Node node) {
        if (node == null) {
            return;
        }

        Queue<Node> a = new LinkedList<Node>();
        a.add(node);

        while (true) {

            int queueSize = a.size();
            if (queueSize == 0) {
                break;
            }

            while (queueSize > 0) {

                Node temp = a.peek();
                System.out.print(temp.data + " ");

                a.remove();

                if (temp.lc != null) {
                    a.add(temp.lc);
                }

                if (temp.rc != null) {
                    a.add(temp.rc);
                }

                queueSize--;
            }

            System.out.println();
        }
    }

    public boolean ifFoldableTree(Node node) {
        if (node == null) {
            return true;
        }
        BST bst = new BST();
        return bst.ifMirrorTree(node.lc, node.rc);
    }

    public int getMinDistanceToLeaf(Node node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }

        if (node.lc == null && node.rc == null) {
            return 0;
        }

        return 1 + Math.min(getMinDistanceToLeaf(node.lc), getMinDistanceToLeaf(node.rc));
    }

    public int getMaxDistanceToLeaf(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        if (node.lc == null && node.rc == null) {
            return 0;
        }

        return 1 + Math.max(getMaxDistanceToLeaf(node.lc), getMaxDistanceToLeaf(node.rc));
    }

    public Node findLCA(Node node, int n1, int n2) {
        if (node == null) {
            return null;
        }

        if (node.data == n1 || node.data == n2) {
            return node;
        }

        Node leftLCA = findLCA(node.lc, n1, n2);
        Node rightLCA = findLCA(node.rc, n1, n2);

        if (leftLCA != null && rightLCA != null) {
            return node;
        }
        return leftLCA != null ? leftLCA : rightLCA;

    }

    public int distanceBetweenTwoNodes(Node node, int n1, int n2) {
        if (node == null) {
            return -1;
        }

        Node lca = this.findLCA(node, n1, n2);

        if (lca == null) {
            return -1;
        }

        int d1 = distanceFromParentToNode(lca, n1, 0);
        int d2 = distanceFromParentToNode(lca, n2, 0);

        return d1 + d2;
    }

    public int distanceFromParentToNode(Node node, int val, int distance) {
        if (node == null) {
            return -1;
        }

        if (node.data == val) {
            return distance;
        }

        int d = distanceFromParentToNode(node.lc, val, distance + 1);

        if (d != -1) {
            return d;
        }

        d = distanceFromParentToNode(node.rc, val, distance + 1);

        return d;
    }

    int sumOfLeftLeafNode;

    public void sumOfLeftLeafNodesAnother(Node node, boolean ifLeftLeaf) {
        if (node == null) {
            return;
        }

        if (node.lc == null && node.rc == null && ifLeftLeaf) {
            sumOfLeftLeafNode = sumOfLeftLeafNode + node.data;
        }

        sumOfLeftLeafNodesAnother(node.lc, true);
        sumOfLeftLeafNodesAnother(node.rc, false);
    }

    public int getDiameter1(Node root) {
        int leftHeight = height(root.lc);
        int rightHeight = height(root.rc);
        return 1 + leftHeight + rightHeight;
    }

    public boolean ifIsomorphic(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        if (node1.data != node2.data) {
            return false;
        }

        return (ifIsomorphic(node1.lc, node2.lc) && ifIsomorphic(node1.rc, node2.rc))
                || (ifIsomorphic(node1.lc, node2.rc) && ifIsomorphic(node1.rc, node2.lc));

    }

    public void printNodesAtKthDistanceFromRoot(Node node, int k){
        if(node == null){return;}
        if(k==0){
            System.out.println(node.data);
        }
        else
        {
            printNodesAtKthDistanceFromRoot(node.lc, k-1);
            printNodesAtKthDistanceFromRoot(node.rc, k-1);
        }
    }
}