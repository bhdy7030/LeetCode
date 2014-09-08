# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return an integer
    def minDepth(self, root):
        if not root:
            return 0
        count = 0
        que = []
        que.append(root)
        while que:
            cur = []
            for node in que:
                if not node.left and not node.right:
                    count+=1
                    return count
                if node.left:
                    cur.append(node.left)
                if node.right:
                    cur.append(node.right)
            count+=1
            que = cur    
        
        return count
            