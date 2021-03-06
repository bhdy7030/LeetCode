/**
 
 Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    public boolean isBalanced(TreeNode root) {
	
		
        // Start typing your Java solution below
        // DO NOT write main() function
		if(root==null) return true;
		int gap = Math.abs(depth(root.right)-depth(root.left));
		if ((gap<2)&&isBalanced(root.left)&&isBalanced(root.right)) return true;
        else return false;
    }
	

	public int depth(TreeNode root){
		if(root ==null) return 0;
		return Math.max(depth(root.left)+1,depth(root.right)+1);
	}
	

	
	
	
}