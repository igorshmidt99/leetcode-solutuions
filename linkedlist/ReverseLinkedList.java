package linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        return reverse(null, head);
    }

    private ListNode reverse(ListNode prev, ListNode curr) {
        if (curr.next == null) {
            curr.next = prev;
            return curr;
        }
        var newHead = reverse(curr, curr.next);
        curr.next = prev;
        return newHead;
    }
}
