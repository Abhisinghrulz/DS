package bst;

import java.util.*;

public class BottomViewBT {

    Node root;
    public static TreeMap<Integer, Integer> ht = new TreeMap<>();

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

    public class QueuePack {
        int level;
        Node tnode;

        public QueuePack(int level, Node tnode) {
            this.level = level;
            this.tnode = tnode;
        }
    }

    public void bottomView(Node root, int level) {
        if (root == null)
            return;
        // create a queue for level order traversal
        Queue<QueuePack> queue = new LinkedList<>();
        // add root with level 0 (create a queue item pack)
        queue.add(new QueuePack(level, root));
        while (!queue.isEmpty()) {
            QueuePack q = queue.remove();
            // take out the items from the package
            Node tnode = q.tnode;
            int lvl = q.level;

            // keep updating the Map so that it will have the last entry from
            // each level(vertically) and that will the bottom view of the tree
            ht.put(lvl, tnode.data);

            // add the left and right children of visiting nodes to the queue
            if (tnode.lc != null) {
                queue.add(new QueuePack(lvl - 1, tnode.lc));
            }
            if (tnode.rc != null) {
                queue.add(new QueuePack(lvl + 1, tnode.rc));
            }
        }

    }

    public static void display() { // print the bottom view.
        Set<Integer> keys = ht.keySet();
        for (Integer key : keys) {
            System.out.print(ht.get(key) + " ");
        }

    }

    public static void main(String[] args) {
        BottomViewBT bottomViewBT = new BottomViewBT();
        bottomViewBT.insertItem(8);
        bottomViewBT.insertItem(3);
        bottomViewBT.insertItem(10);
        bottomViewBT.insertItem(1);
        bottomViewBT.insertItem(6);
        bottomViewBT.insertItem(14);
        bottomViewBT.insertItem(4);
        bottomViewBT.insertItem(7);
        bottomViewBT.insertItem(13);

        bottomViewBT.bottomView(bottomViewBT.root, 0);
        bottomViewBT.display();
    }
}
