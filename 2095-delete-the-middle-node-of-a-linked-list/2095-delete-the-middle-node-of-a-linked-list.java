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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode temp = head;
        
        int cnt = 0;
        while(temp!=null){
            temp = temp.next;
            cnt++;
        }
        
        int mid = cnt/2;
        System.out.println(mid);
        
        
        temp = head;
        
        while(temp!=null){
            
            mid--;
            
            if(mid == 0){
                 temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        
        return head;
    }
}