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
    
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int list1Length = getLength(list1);
        if(a>list1Length || b>list1Length)return null;
        ListNode temp1 = null;
        ListNode temp2 = null;
        ListNode temp = list1;
        for (int i = 0; i < list1Length; i++) {
            if(i==a-1)temp1 = temp;
            if (i==b)temp2 = temp.next;
            temp = temp.next;
        }
        temp1.next = list2;
        while(temp1.next != null){
            temp1= temp1.next;
        }
        temp1.next = temp2;
        return list1;
    }
}