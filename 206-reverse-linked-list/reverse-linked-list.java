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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode temp=head;
        ListNode front=null;
        if(temp==null)return null;
        if(temp.next==null)return temp;
        while(temp.next!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        temp.next=prev;
        return temp;
    }
}