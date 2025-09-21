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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        int count = 0;

        while(current != null && count < k) {
            current = current.next;
            count++;
        }
        if(count == k) {
            ListNode prev = reverseKGroup(current, k);
            current = head;
            while(count > 0) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count--;
            }
            return prev;
        }
        return head;
    }
}

/*
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;
        int count = 0;

        while(count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        ListNode restOfTheList = reverseKGroup(current, k);

        head.next = restOfTheList;

        return prev;
    }
*/