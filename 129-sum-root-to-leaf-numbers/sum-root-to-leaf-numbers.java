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
    public int sumNumbers(TreeNode root) {
        int res=0;
        if(root==null)return res;
        return sumNumbers(root, root.val);
        
    }
    public int sumNumbers(TreeNode root, int sum){
        if(root.right == null && root.left == null){
           return sum;
        }
        int left=0, right=0;
        if(root.left!=null){
            left= sumNumbers(root.left,sum*10+root.left.val);
        }
        if(root.right!=null){
            right =sumNumbers(root.right, sum*10+root.right.val);
        }
        return left+right;
    }
}