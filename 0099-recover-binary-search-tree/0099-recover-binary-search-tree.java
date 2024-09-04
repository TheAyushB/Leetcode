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
    TreeNode a, b;
    TreeNode prev;
    private void recoverHelper(TreeNode cur){
        if(cur == null)
            return;
        recoverHelper(cur.left);
        if(prev != null && prev.val > cur.val){
            if(a == null)
                a = prev;
            b = cur;
        }
        prev = cur;
        recoverHelper(cur.right);
    }
    public void recoverTree(TreeNode root) {
        recoverHelper(root);
        int temp = a.val;
        a.val = b.val;
        b.val = temp;

    }
}