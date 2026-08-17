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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode cur=head;
        int s=0;
        while(cur!=null){
            s++;
            cur=cur.next;
        }
        n=s-n+1;
        ListNode prev=head;
        for(int i=1;i<n-1;i++){
            prev=prev.next;
        }
        if(n==1){
            head=head.next;
            return head;
        }
        prev.next=prev.next.next;
        
        return head;
    }
}