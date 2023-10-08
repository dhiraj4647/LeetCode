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
        
    public ListNode rotateRight(ListNode head, int k) {

        int length =0;
        ListNode temp1 = head;
        ListNode temp2 = head;
        //find the length of linked list
        while (temp1 != null){
            temp1 = temp1.next;
            length++;
        }
        if(length!=0)length = k%length;
        else return  null;
        temp1 = head;
       while (temp2 != null && length > 0){
            temp2 = temp2.next;
            length--;
        }
        
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