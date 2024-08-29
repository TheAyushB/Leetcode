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
    public boolean isMirror(TreeNode original, TreeNode mirror){
        if(original == null && mirror == null)
            return true;
        if(original == null || mirror == null)
            return false;
        return original.val == mirror.val && isMirror(original.left, mirror.right) && isMirror(original.right, mirror.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
}