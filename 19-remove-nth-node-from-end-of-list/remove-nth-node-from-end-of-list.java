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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode temp=head;
    int c=0;
    while(temp!=null){
        temp=temp.next;
        c++;
    }
    int k=c-n+1;
    if (k == 1) {
            return head.next;
        }
ListNode temp1=head;
   for(int i=1;i<k-1;i++){
    temp1=temp1.next;
   }
   temp1.next=temp1.next.next;
   return head;
   

        
    }
   
}