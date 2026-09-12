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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int n=0;
        ListNode l=head;
        while(l!=null){
            n++;
            l=l.next;
        }
        int m=k%n;
        while(m!=0){
            l=head;
            for(int i=0;i<n-2;i++){
                l=l.next;
            }
            ListNode a=l.next;
            l.next=null;
            l=head;
            head=a;
            a.next=l;
            m--;
        }
        return head;
    }
}