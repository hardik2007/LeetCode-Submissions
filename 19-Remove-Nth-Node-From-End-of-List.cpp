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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp = head;
        int c = 0;
        while(temp!=nullptr){
            temp = temp->next;
            c++;
        }
        if(c==n){
            ListNode* temphead = head;
            head = head->next;
            delete temphead;
            return head;
        }
        temp = head;
        for(int i=0;i<(c-n-1);i++){
            temp = temp->next;
        }
        ListNode* temp2 = temp->next;
        temp->next = temp->next->next;
        temp2->next = nullptr;
        delete temp2;
        return head;
    }
};