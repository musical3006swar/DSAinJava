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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> arrL = new ArrayList<>();
        if(root==null)return arrL;
        List<Integer> arr=new ArrayList<>();
        arr.add(root.val);
        pathSum(root, targetSum, root.val, arrL,arr);
        return arrL;
    }
    public void pathSum(TreeNode root, int targetSum, int sum, List<List<Integer>> arrL, List<Integer> arr){
        if(root.left == null && root.right==null){
            if(sum==targetSum){
                arrL.add(new ArrayList<>(arr));
            }
            return;
        }
        if(root.left!=null){
            arr.add(root.left.val);
            pathSum(root.left, targetSum, sum+root.left.val, arrL, arr);
            arr.remove(arr.size()-1);
        }        
        if(root.right!=null){
            arr.add(root.right.val);
            pathSum(root.right, targetSum, sum+root.right.val, arrL, arr);
            arr.remove(arr.size()-1);
        }   
        return;        
    }
}