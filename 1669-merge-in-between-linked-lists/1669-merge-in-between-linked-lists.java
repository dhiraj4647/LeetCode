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
    
    
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int list1Length = 0;
        
        ListNode temp1 = null;
        ListNode temp2 = null;
        ListNode temp = list1;
        while(temp != null){
            if(list1Length==a-1)temp1 = temp;
            if (list1Length==b)temp2 = temp.next;
            temp = temp.next;
            list1Length++;
        }
        temp1.next = list2;
        while(temp1.next != null){
            temp1= temp1.next;
        }
        temp1.next = temp2;
        return list1;
    }
}