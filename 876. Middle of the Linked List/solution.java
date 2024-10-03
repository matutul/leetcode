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
    public ListNode middleNode(ListNode head) {
        ListNode tempHead = head;
        int midIndex = 1;
        while(tempHead.next!=null){
            tempHead = tempHead.next;
            midIndex++;
        }
        midIndex = midIndex/2;
        tempHead = head;
        while(midIndex-->0){
            tempHead = tempHead.next;
        }
        return tempHead;
    }
}