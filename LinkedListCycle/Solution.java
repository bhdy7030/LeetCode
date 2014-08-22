/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head==null) return false;
        
        ListNode p1 = head;//slow
        ListNode p2 = head;//fast
        
        while(p1!=null&&p2!=null && p2.next!=null){
            if(p1.next!=null&&p2.next.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
                if(p1.val==p2.val) return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
