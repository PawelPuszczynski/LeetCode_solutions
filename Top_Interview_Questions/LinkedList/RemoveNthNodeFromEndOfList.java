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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        Map<Integer, ListNode> hashMap = new HashMap<>();

        int position = 0;

        while (head != null) {
            hashMap.put(position, head);
            head = head.next;
            position++;
        }

        ListNode nodeToRemove = hashMap.get(hashMap.size() - n);

        if (nodeToRemove == hashMap.get(hashMap.size() - 1)) {
            hashMap.get(hashMap.size() - 2).next = null;
        } else {
            nodeToRemove.val = nodeToRemove.next.val;
            nodeToRemove.next = nodeToRemove.next.next;
        }
        return hashMap.get(0);
        
    }
}