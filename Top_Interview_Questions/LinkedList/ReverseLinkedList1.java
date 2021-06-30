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
    public ListNode reverseList(ListNode head) {

        if (head == null) return null;
        var tempNode = new ListNode(head.val);

        while (head.next != null) {
            var currTempNode = new ListNode(head.next.val);
            currTempNode.next = tempNode;
            tempNode = currTempNode;
            head = head.next;
        }

        return tempNode;
        
    }
}