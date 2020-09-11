package bst.view;

import java.util.*;

public class BottomViewBT {

    public static TreeMap<Integer, Integer> ht = new TreeMap<>();

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
            QueuePack q = queue.poll();
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
        Node root = new Node(1);
        root.lc = new Node(2);
        root.rc = new Node(3);
        root.lc.lc = new Node(4);
        root.lc.rc = new Node(5);
        root.rc.lc = new Node(6);
        root.rc.rc = new Node(7);

        bottomViewBT.bottomView(root, 0);
        bottomViewBT.display();
        //bottomViewBT.levelOrderTraversal(bottomViewBT.root);
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

}
