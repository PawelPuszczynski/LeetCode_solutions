/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) return false;

        Map<ListNode, Integer> hashMap = new HashMap<>();
        while (head.next != null) {
            if (hashMap.containsKey(head.next)) {
                return true;
            } else {
                hashMap.put(head, head.val);
            }
            head = head.next;
        }
        return false;

    }
}