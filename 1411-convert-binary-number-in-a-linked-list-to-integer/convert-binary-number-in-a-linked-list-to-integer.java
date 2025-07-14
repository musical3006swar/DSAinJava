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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> x= new ArrayList<>();
        while(head!=null){
            x.add(head.val);
            head=head.next;
        }
        System.out.println(x);
        int num=0,twoMul=2;
        boolean flag=true;
        for(int i=x.size()-1;i>=0;i--){
            if(flag){
                num=num+(x.get(i)*1);
                flag=false;
            }else{
                num=num+(x.get(i)*twoMul);
                twoMul=twoMul*2;
            }
        }
        return num;
    }
}