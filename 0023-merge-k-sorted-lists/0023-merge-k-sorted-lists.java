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
    public ListNode mergeKLists(ListNode[] lists) {
        // custom comparator
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );

        //insert the minimum node of each sorted list
        for(int i = 0; i < lists.length; i++){
            if(lists[i] != null)
                pq.add(lists[i]);
        }
        //create our answer linked list
        ListNode head = null;
        ListNode cur = head;

        while(!pq.isEmpty()){
            //remove and return the current minimum node in O(logk)
            ListNode curMinNode = pq.poll();
            if(head == null){
                head = new ListNode(curMinNode.val);
                cur = head;

            }
            else {
                cur.next = new ListNode(curMinNode.val);
                cur = cur.next;
            }

            //add the next minimum node
            if(curMinNode.next != null)
                pq.add(curMinNode.next);
        }

        return head;
    }
}