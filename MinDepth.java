/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return 0;
    	if(root.left==null&&root.right==null) return 1;
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		if(left==0) left = Integer.MAX_VALUE;
		if(right==0) right = Integer.MAX_VALUE;
		return Math.min(left,right)+1;
    }
}