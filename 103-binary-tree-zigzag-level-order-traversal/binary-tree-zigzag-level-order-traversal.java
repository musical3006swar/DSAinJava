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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> arrL=new ArrayList<>();
        if (root == null) return arrL;
        que.offer(root);
        boolean leftToRight = true;
        while(!que.isEmpty()){
            int levelNum=que.size();
            List<Integer> arr= new ArrayList<>();
            for(int i=0;i<levelNum;i++){
                TreeNode temp=que.poll();
                if(leftToRight){
                    if(temp!=null){
                        arr.add(temp.val);
                    }
                }else{
                    if(temp!=null){
                        arr.add(0,temp.val);
                    }
                }
                if(temp!=null && temp.left!=null){
                    que.offer(temp.left);
                }
                if(temp!=null && temp.right!=null){
                    que.offer(temp.right);
                }
            }
            leftToRight=!leftToRight;
            arrL.add(arr);
        }
        return arrL;
    }
}