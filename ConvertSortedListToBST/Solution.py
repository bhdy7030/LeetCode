# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
#
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a list node
    # @return a tree node
    def sortedListToBST(self, head):
        if not head:
            return None
        length = 1
        temp = head
        while temp.next:
            length+=1
            temp = temp.next
    
        Solution.h = head
        return self.sortedListToBSTRec(0,length-1)
        
        
    def sortedListToBSTRec(self,start,end):
        if start>end:
            return None
        mid = (start+end)/2
        left = self.sortedListToBSTRec(start,mid-1)
        root = TreeNode(Solution.h.val)
        Solution.h = Solution.h.next
        right = self.sortedListToBSTRec(mid+1,end)
        
        root.left = left
        root.right = right
        
        return root
        
        
        
    
    
