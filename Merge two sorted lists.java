#####
One better solustion but same idea.
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 != null ? l1 : l2;
        }
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        cur.next = l1 != null ? l1 : l2;

        return head.next;
    }

在很多时候，递归的方案可以提供一种清晰简单的解决方案，代码也更精炼。但是递归有个问题就是容易出现堆栈溢出的问题。
public:
    ListNode *mergeTwoLists(ListNode *l1, ListNode *l2) {
        if(l1 == NULL) return l2;
        if(l2 == NULL) return l1;

        if(l1->val < l2->val) {
            l1->next = mergeTwoLists(l1->next, l2);
            return l1;
        } else {
            l2->next = mergeTwoLists(l2->next, l1);
            return l2;
        }
    }
};

This my version.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        int p1=0;
        int p2=0;
        ListNode temp =new ListNode(0);
        ListNode head=temp;
        if(l1==null) return l2;
        if(l2==null) return l1;
       
        while(l1.next!=null || l2.next!=null){
            if (l1.val<= l2.val) {
                temp.next= new ListNode(l1.val);
                temp=temp.next;
                if(l1.next==null){
                    temp.next=l2;
                    return head.next;
                }
                l1=l1.next;        
            }
            if (l1.val>=l2.val) {      
                temp.next= new ListNode(l2.val);
                temp=temp.next;
                 if(l2.next==null){
                    temp.next=l1;
                    return head.next;
                }
                l2=l2.next;     
            }
        }
        if(l1.next==null &&l2.next==null){
            if(l1.val>l2.val) {
                temp.next= new ListNode(l2.val);
                temp=temp.next;
                temp.next= new ListNode(l1.val);
            }
            else {
                temp.next= new ListNode(l1.val);
                temp=temp.next;
                temp.next= new ListNode(l2.val);
            }
        } 
        return head.next;
    }
}


