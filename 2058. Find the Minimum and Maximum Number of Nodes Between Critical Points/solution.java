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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minDistance = 0;
        int maxDistance = 0;
        ListNode prev = head;
        int nodeCount = 1;
        int prevNodeCount = 0;
        while(prev.next != null ){
            nodeCount++;
            if(prev.next.next != null){
                if((prev.val>prev.next.val && prev.next.val<prev.next.next.val) || (prev.val<prev.next.val && prev.next.val>prev.next.next.val)){
                    if(prevNodeCount>0){
                        if(minDistance == 0){
                            minDistance = nodeCount-prevNodeCount;
                        }else if((nodeCount-prevNodeCount)<minDistance){
                            minDistance = nodeCount-prevNodeCount;
                        }
                    }else{
                        maxDistance = nodeCount;
                    }
                    prevNodeCount = nodeCount;
                }
            }
            prev = prev.next;
        }
        if(minDistance>0){
            return new int[]{minDistance, prevNodeCount-maxDistance};
        }else{
            return new int[]{-1, -1};
        }
    }
}