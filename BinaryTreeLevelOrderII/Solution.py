# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None


class Solution:
    # @param root, a tree node
    # @return a list of lists of integers
    def levelOrderBottom(self, root):
        if not root:
            return []
        q = []
        q.append(root)
        res = []
        temp = []
        
        currentLevel = 1
        nextLevel = 0
        
        while q:
            n = q.pop(0)
            temp.append(n.val)
            currentLevel-=1;
            if n.left:
                q.append(n.left)
                nextLevel+=1
            if n.right:
                q.append(n.right)
                nextLevel+=1
            if currentLevel==0:
                res.append(temp)
                temp=[]
                currentLevel=nextLevel
                nextLevel=0
            
        return res[::-1]
                
                
