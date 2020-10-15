Solution
- The last element of postorder array will contain the root element as it's postorder so create a node of this value
- Now traverse from last of array & find the value lesser than node value which we just created
- Let's say we find the value at ith index
- Now all values from start to i will be in left sub tree & from i + 1 to end - 1 will be in right subtree
- Again recursively call the function with node.left = create(arr, start, i) & node.right = create(arr, i+1, end-1)
- return node from function

Time Complexity: O(n), where n is total number of elements in array
Space Complexity: O(1)

https://thecodingsimplified.com/create-bst-from-given-postorder-traversal/