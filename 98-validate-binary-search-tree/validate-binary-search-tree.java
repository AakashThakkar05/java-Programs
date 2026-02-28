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
    public boolean solve(TreeNode root, Long min, Long max){
        if(root == null) return true;
        if((min != null && min >= root.val) ||
          (max != null && max <= root.val)) {
            return false;
        }
        boolean left = solve(root.left, min, (long)root.val);
        boolean right = solve(root.right, (long)root.val, max);
        return left && right;
    }
    public boolean isValidBST(TreeNode root) {
        return solve(root, null, null);
    }
}