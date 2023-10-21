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
    public int numComponents(ListNode head, int[] nums) {
        List<Integer> ints = Arrays.stream(nums).boxed().collect(Collectors.toList());
        ListNode temp = head;
        int count = 0;
        int prevConn = 0;
        while(temp != null) {
            int val = temp.val;
            if(ints.contains(val) && prevConn ==0){
                count++;
                prevConn = 1;
            } else if(!ints.contains(val)){
                prevConn = 0;
            }
            temp = temp.next;
        }
        return count;
    }
}