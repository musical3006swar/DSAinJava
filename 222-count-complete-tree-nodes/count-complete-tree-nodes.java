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
    public int countNodes(TreeNode root) {
        int leftDepth=leftDepth(root);
        int rightDepth=rightDepth(root);
        if(leftDepth==rightDepth){
            return (int)Math.pow(2,leftDepth)-1;
        }else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }

    }
    public int leftDepth(TreeNode root){
        int len=0;
        while(root!=null){
            root=root.left;
            len++;
        }
        return len;
    }
    public int rightDepth(TreeNode root){
        int len=0;
        while(root!=null){
            root=root.right;
            len++;
        }
        return len;
    }
}