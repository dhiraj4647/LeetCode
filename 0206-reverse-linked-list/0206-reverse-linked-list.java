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
    public ListNode reverseList(ListNode head) {
        if(head==null)return null;
        ListNode pre = null;
        ListNode curr = head;
        while(head != null){
            head = curr.next;
            curr.next = pre;
            pre = curr;
            curr = head;
        }
        return pre;
    }
}