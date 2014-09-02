/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       /** 
        if(head==null) return null;
        ListNode p;
        p = head;
        ListNode q = new ListNode(0);
        q.next = p;
        while(head.next!=null){
            if(p.val!=head.next.val){
                p.next = head.next;
                p = p.next;
                head = head.next;
            }
            else{
                head = head.next;
                p.next = null;
            }
        }
        return q.next;
        **/
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode left = head;
        ListNode right = head.next;
        while(right!=null){
            
            if(left.val ==right.val){
                left.next= right.next;
                right = right.next;
            }
            else{
                left= left.next;
                right= right.next;
            }
        }
        
        return head;
    }
}