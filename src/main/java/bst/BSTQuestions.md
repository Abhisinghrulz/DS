BST

1) InsertItem BT BST
2) PreOrder PostOrder InOrder
3) LevelOrderTraversal, LevelOrderTraversalReverse
4) Left Right Top Bottom View
5) Leaf Sum, Left Leaf Sum
6) isBST
7) height
8) ifNodePresent
9) getParentNode
10) getSiblingNode
11) getInorderParent
12) getMax, getMin
13) ifPairExistsUtil
14) getKthSmallestElementFromBST
15) getKthLargestElementFromBST
16) ifMirrorTree
    ````
         return node1.data == node2.data
                        && ifMirrorTree(node1.lc, node2.rc)
                        && ifMirrorTree(node1.rc, node2.lc);
    ````
17) getDiameter => 1 + height(node.lc) + height(node.rc)
18) isIsomorphic
19) mirrorTree 
    ````
    swap(node.lc,node.rc) 
    mirrorTree(node.lc)
    mirrorTree(node.rc)
    ````
20) levelOrderTraversalOrderLineByLine 
21) ifFoldableTree => ifMirrorTree(node.lc, node.rc)
22) getMinDistanceToLeaf
23) getMaxDistanceToLeaf
24) findLCA
    => findLCA(Node node, int n1, int n2)
25) distanceBetweenTwoNodes
26) distanceFromParentToNode
    => distanceFromParentToNode(Node node, int val, int distance)
27) BSTToSortedLinkedList
28) SortedLinkedListToBST
29) MakeBST
    1) PostOrder
        => LastElementIsRoot
    2) PreOrder
        => FirstElementIsRoot
30) PrintNodeAtKthDistanceFromRoot