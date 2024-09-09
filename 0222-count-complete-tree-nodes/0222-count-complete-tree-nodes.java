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
// count no of nodes in a complete binary tree

class Solution {
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;
        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);

        if(leftHeight == rightHeight)
            return ((2 << (leftHeight)) - 1);

        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public int getLeftHeight(TreeNode root)
    {
        int lh = 0;
        while(root.left != null)
        {
            root = root.left;
            lh ++;
        }
        return lh;
    }

    public int getRightHeight(TreeNode root)
    {
        int rh = 0;
        while(root.right != null)
        {
            root = root.right;
            rh ++;
        }
        return rh;
    }
}