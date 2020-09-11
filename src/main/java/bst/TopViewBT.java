package bst;

import java.util.*;

public class TopViewBT {

    Node root;
    public static Map<Integer, Integer> ht = new LinkedHashMap<>();

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

    public void topView(Node root, int level) {
        if (root == null) {
            return;
        }

        Queue<QueuePack> queue = new LinkedList<>();

        queue.add(new QueuePack(level, root));

        while (!queue.isEmpty()) {
            QueuePack q = queue.poll();

            Node tnode = q.tnode;
            int lvl = q.level;

            if (ht.containsKey(lvl)) {

            } else {
                System.out.print(tnode.data + " ");
                ht.put(lvl, tnode.data);
            }
            // add the left and right children of visiting nodes to the queue
            if (tnode.lc != null) {
                queue.add(new QueuePack(lvl + 1, tnode.lc));
            }
            if (tnode.rc != null) {
                queue.add(new QueuePack(lvl - 1, tnode.rc));
            }
        }
    }

    public static void main(String[] args) {
        TopViewBT topViewBT = new TopViewBT();
        topViewBT.insertItem(8);
        topViewBT.insertItem(3);
        topViewBT.insertItem(10);
        topViewBT.insertItem(1);
        topViewBT.insertItem(6);
        topViewBT.insertItem(14);
        topViewBT.insertItem(4);
        topViewBT.insertItem(7);
        topViewBT.insertItem(13);

        topViewBT.topView(topViewBT.root, 0);
    }
}
