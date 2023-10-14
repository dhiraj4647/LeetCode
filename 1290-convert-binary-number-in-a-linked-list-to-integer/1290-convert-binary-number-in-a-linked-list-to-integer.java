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
    public int getLength(ListNode head) {
        int k = 1;
        while (head.next != null) {
            head = head.next;
            k+=k;
        }
        return k;
    }
    
    public int getDecimalValue(ListNode head) {
        int size = getLength(head);
        ListNode temp = head;
        int decimalNumber = 0;
        while(temp != null) {
            decimalNumber +=(temp.val==1?1:0)*size;
            temp = temp.next;
            size = size/2;
        }
        return decimalNumber;
    }
}