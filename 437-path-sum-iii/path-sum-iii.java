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
    int count = 0;
    public void solve( TreeNode root, int targetSum, ArrayList<Integer> ans){
        if(root == null) return;
        ans.add(root.val);
        solve(root.left,targetSum, ans);
        solve(root.right,targetSum, ans);
        long sum = 0;
        for(int i = ans.size()-1; i >= 0; i--){
            sum += ans.get(i);
            if(sum == targetSum){
                count++;
            }
        }
        ans.remove(ans.size() - 1);
    }
    public int pathSum( TreeNode root, int targetSum) {
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root, targetSum, ans);
        return count;
    }
}