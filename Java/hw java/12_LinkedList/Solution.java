class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public int getSize(ListNode head) {
        int counter = 0;
        ListNode curr = head;
        while (curr != null) {
            counter++;
            curr = curr.next;
        }
        return counter;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = getSize(headA);
        int sizeB = getSize(headB);

        // Move headA to the same starting point as headB
        while (sizeA > sizeB) {
            headA = headA.next;
            sizeA--;
        }

        // Move headB to the same starting point as headA
        while (sizeB > sizeA) {
            headB = headB.next;
            sizeB--;
        }

        // Traverse both lists to find the intersection point
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        // Return either the intersection node or null if no intersection exists
        return headA;
    }
}
