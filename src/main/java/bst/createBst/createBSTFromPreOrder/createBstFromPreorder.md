Solution
- The first element of Preorder array will contain the root element as it's preorder so create a node of this value
- Now traverse from start of array & find the value greater than node value which we just created
- Let's say we find the value at ith index
- Now all values from start + 1 to i - 1 will be in left sub tree & from i to end  will be in right subtree
- Again recursively call the function with node.left = create(arr, start + 1, i - 1) & node.right = create(arr, i, end)
- return node from function

Time Complexity: O(n), where n is total number of elements in array
Space Complexity: O(1)

https://thecodingsimplified.com/create-bst-from-given-preorder-traversal/