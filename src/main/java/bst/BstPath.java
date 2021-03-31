package bst;

import java.util.ArrayList;

public class BstPath {
    public void printPaths(BST.Node root, ArrayList arr) {
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
}
