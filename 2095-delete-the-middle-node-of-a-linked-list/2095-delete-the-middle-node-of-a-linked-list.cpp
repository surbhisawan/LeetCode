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
    ListNode* deleteMiddle(ListNode* head) {
        if(head==NULL || head->next==NULL)
            return NULL;
        
        ListNode* node1 = head, *node2 = head;
        int size=0;
        while(node1!=NULL){
            size++;
            node1=node1->next;
        }
        
        int middle = size/2;
        
        for(int i=0;i<middle-1;i++){
            node2=node2->next;
        }
        node2->next=node2->next->next;
        return head;
    }
};