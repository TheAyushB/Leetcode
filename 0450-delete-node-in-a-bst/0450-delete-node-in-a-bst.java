/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // go right first, and then as left as possible.
    public int successor(TreeNode root)
    {
        root = root.right;
        while(root.left != null)
            root = root.left;
        return root.val;
    }

    // go left first, and then as right as possible.
    public int predecessor(TreeNode root)
    {
        root = root.left;
        while(root.right != null)
            root = root.right;
        return root.val;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;
        
        // delete from the right subtree
        if(key > root.val)
            root.right = deleteNode(root.right, key);
        // delete from the left subtree
        else if(key < root.val)
            root.left = deleteNode(root.left, key);
        else 
        {
            // the node which we want to delete

            // 1. node is a leaf
            if(root.left == null && root.right == null)
                root = null;
            // 2. node is not leaf and it has a right child
            else if(root.right != null)
            {
                root.val = successor(root);
                root.right = deleteNode(root.right, root.val);
            }
            // 3. node is not leaf, node doesn't have a right child, but it has a left child
            else
            {
                root.val = predecessor(root);
                root.left = deleteNode(root.left, root.val);
            }
        }
        return root;
    }
}