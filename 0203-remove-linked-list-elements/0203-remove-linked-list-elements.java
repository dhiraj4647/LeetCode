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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)return head;
        while(head != null && head.val ==val){
            head=head.next;
        }

        ListNode listNode = head;
        ListNode temp = head;
        while(listNode!=null){
            if(listNode.val == val){
                temp.next = listNode.next;
                listNode = listNode.next;
            }else {
                temp = listNode;
                listNode = listNode.next;
            }
        }
        return head;
    }
}