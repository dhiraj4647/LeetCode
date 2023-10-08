/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public int getLength(ListNode head){
        int k =0;
        while (head != null){
            head = head.next;
            k++;
        }
        return k;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLength = getLength(headA);
        int bLength = getLength(headB);
        while(aLength>bLength){
            headA = headA.next;
            aLength--;
        }

        while(aLength<bLength){
            headB = headB.next;
            bLength--;
        }

        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}