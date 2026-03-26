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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long,Integer> hm =new HashMap<>();
        hm.put(0L,1);
        if(root==null)return 0;
        pathSum(root, targetSum, 0, hm);
        return count;
    }
    public void pathSum(TreeNode root, int targetSum, long currSum,HashMap<Long,Integer> hm){
        if(root==null)return;
        currSum+=root.val;
        if(hm.containsKey(currSum-(long)targetSum)){
            count+=hm.get(currSum-(long)targetSum);
        }
        hm.put(currSum, hm.getOrDefault(currSum, 0) + 1);
        pathSum(root.left, targetSum, currSum, hm);
        pathSum(root.right, targetSum, currSum, hm);
        hm.put(currSum, hm.get(currSum)-1);
    }
}