/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        if(head==NULL)
            return head;
        
        
        while(head->val==val){
            if(head->next==NULL){
                return NULL;
            }
            else
                head=head->next;
        }
        
        
        ListNode* temp1 = head;
        while(temp1!=NULL){
            if(temp1->next!=NULL && temp1->next->val==val){
               temp1->next=temp1->next->next;
            }
            else{
            temp1=temp1->next;
            }
        }
        
        return head;
    }
};