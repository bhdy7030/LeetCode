# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @return a ListNode
    def removeNthFromEnd(self, head, n):
        
        newhead = ListNode(0)
        newhead.next = head
        left = newhead
        right = newhead
        while n>0:
            if not right.next:
                return head
            right = right.next
            n=n-1
        
        while right.next:
            left = left.next
            right = right.next
        
        left.next = left.next.next
        return newhead.next
