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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newnode = new ListNode(0);
        ListNode q1 = newnode;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                q1.next=list1;
                list1=list1.next;
            }
            else{
                q1.next=list2;
                list2=list2.next;
            }
            q1=q1.next;
        }
       if(list1!=null){
        q1.next=list1;
       }
       if(list2!=null){
        q1.next=list2;
       }
        return newnode.next;
    }
}