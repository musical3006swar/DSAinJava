/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return build(pre, post, 0, pre.length - 1, 0, post.length - 1);
    }

    private TreeNode build(int[] pre, int[] post, int preStart, int preEnd, int postStart, int postEnd) {
        if (preStart > preEnd) return null;

        TreeNode root = new TreeNode(pre[preStart]);
        if (preStart == preEnd) return root; 

        int leftRootVal = pre[preStart + 1];
        int idx = postStart;

        while (post[idx] != leftRootVal) idx++;

        int leftSize = idx - postStart + 1;
        root.left = build(pre, post, preStart + 1, preStart + leftSize, postStart, idx);
        root.right = build(pre, post, preStart + leftSize + 1, preEnd, idx + 1, postEnd - 1);

        return root;
    }
}
