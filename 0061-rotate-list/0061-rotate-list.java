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
    public int getLength(ListNode head){
        int k =0;
        while (head != null){
            head = head.next;
            k++;
        }
        return k;
    }
    public ListNode rotateRight(ListNode head, int k) {

        ListNode temp1 = head;
        ListNode temp2 = head;
        int length = getLength(temp1);
        if(length ==0)return null;
        temp1 = head;
        length = k%length;
       while (temp2 != null && length > 0){
            temp2 = temp2.next;
            length--;
        }
        if(length!=0)return null;
        while(temp2.next !=null){
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        temp2.next = head;
        temp2 = temp1.next;
        temp1.next = null;
        
        return temp2;
    }
}