
/**

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:

    1
   / \
  2   2
   \   \ 
   3    3


 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(root ==null) return true;
        return isSameTree(root.left,root.right);
    }
	
	
	public boolean isSameTree(TreeNode p,TreeNode q){
		
		if(p==null&&q==null) return true;
		if(p==null||q==null) return false;
		
		if(p.val == q.val && isSameTree(p.left,q.right)&&isSameTree(p.right,q.left))
			return true;
		else{
			return false;
		}
		
	}
}



