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
    int maxCount=Integer.MAX_VALUE;
    public void minDepth(TreeNode root, int depth){
        if(root==null){
            return;
        }
        if(root.left == null && root.right == null){
            maxCount = Math.min(maxCount, depth + 1);
            return;
        }
        minDepth(root.left, depth+1);
        minDepth(root.right, depth+1);
        return;
    }
    public int minDepth(TreeNode root) {
        if(root == null)return 0;
        minDepth(root,0);
        return maxCount;
    }
}