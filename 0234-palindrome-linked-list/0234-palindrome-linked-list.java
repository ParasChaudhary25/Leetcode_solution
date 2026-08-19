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
    public ListNode findMid(ListNode head){
        ListNode end=head;
        ListNode mid=head;
        while(end.next!=null && end.next.next!=null){
            end=end.next.next;
            mid=mid.next;
        }
        return mid;
    }
    public ListNode reverse(ListNode s){
        ListNode prev=null;
        ListNode cur=s;
        while(cur!=null){
            ListNode n=cur.next;
            
            cur.next=prev;
            prev=cur;
            cur=n;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode mid=findMid(head);
        ListNode second=reverse(mid.next);
        ListNode first=head;
        while(second!=null){
            if(first.val!=second.val){
                return false;
            }
            second=second.next;
            first=first.next;
        }
        return true;
    }
}