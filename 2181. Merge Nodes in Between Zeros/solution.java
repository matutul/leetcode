/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode merge = new ListNode();
        ListNode mergeHead = merge;
        ListNode current = head;
        int sum = 0;
        while(current != null){
            sum += current.val;
            if(current.val==0){
                if(sum!=0){
                    merge.next = new ListNode(sum);
                    merge = merge.next;
                }
                sum = 0;
            }
            current = current.next;
        }
        return mergeHead.next;
    }
}