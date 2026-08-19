/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode end=head;
        ListNode mid=head;
        while(end.next!=null && end.next.next!=null){
            end=end.next.next;
            mid=mid.next;
        }
        
        ListNode prev=null;
        ListNode cur=mid.next;
        while(cur!=null){
            ListNode n=cur.next;
            cur.next=prev;
            prev=cur;
            cur=n;
        }
        
        ListNode first=head;
        while(prev!=null){
            if(first.val!=prev.val){
                return false;
            }
            prev=prev.next;
            first=first.next;
        }
        return true;
    }
}