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
    public void flatten(TreeNode root) {
        if(root==null) return;
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode n = root;
        //s.push(n);
        while(n!=null||!s.isEmpty()){
            if(n.right!=null){
                    s.push(n.right);
                }
            if(n.left!=null){
                n.right = n.left;
                n.left=null;
            }
            else{
                if(!s.isEmpty()){
                    n.right = s.pop();
                }
            }
            n = n.right;
        }
    }
}
