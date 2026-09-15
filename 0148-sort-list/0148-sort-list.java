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
    public ListNode sortList(ListNode head) {
        List<Integer> ans=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null){
            ans.add(cur.val);
            cur=cur.next;
        }
        Collections.sort(ans);
        int n=ans.size();
        cur=head;
        for(int i=0;i<n;i++){
            cur.val=ans.get(i);
            cur=cur.next;
        }
        return head;
    }
}