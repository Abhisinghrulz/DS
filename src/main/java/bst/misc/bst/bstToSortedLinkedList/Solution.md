Solution
- We traverse the binary tree in inorder manner
- We take a global variable 'prev' & 'headOfList'
- We assign lowest node as headOfList. This is when prev is null.
- When prev is not null, then node.left = prev & prev.right = node
- After each iteration we update the prev to current node

Time Complexity: O(n)
Space Complexity: O(1)


https://thecodingsimplified.com/convert-bst-to-sorted-doubly-linked-list-problem/