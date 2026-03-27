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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> arr = new ArrayList<>();
        String str = new String();
        if(root == null){
            return arr;
        }
        binaryTreePaths(root,str+Integer.toString(root.val),arr);
        return arr;
    }
    public void binaryTreePaths(TreeNode root, String str, List<String> arr){
        if(root.right == null && root.left == null){
            arr.add(new String(str));
            return;
        }
        if(root.left !=null){
            binaryTreePaths(root.left,str+"->"+Integer.toString(root.left.val),arr);
        }
        if(root.right !=null){
            binaryTreePaths(root.right,str+"->"+Integer.toString(root.right.val),arr);
        }
        return;
    }
}