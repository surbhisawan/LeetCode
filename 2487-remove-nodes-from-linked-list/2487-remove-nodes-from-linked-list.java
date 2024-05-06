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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        
        ListNode curr = head;
        
        while(curr != null){
            stack.push(curr);
            curr = curr.next;
        }
        
        curr = stack.pop();
        ListNode result = new ListNode(curr.val);
        int max = curr.val;
        
        while(!stack.isEmpty()){
            
            curr = stack.pop();
            
            if(curr.val < max)
                continue;
            else{
                ListNode temp = new ListNode(curr.val);
                temp.next = result;
                result = temp;
                max = curr.val;    
            }
        }
        return result;
    }
}