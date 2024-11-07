package linkedlist;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l2val = 0;
        if (l2 != null) {
            l2val = l2.val;
        }

        int here = l1.val + l2val;
        if (here >= 10) {
            String[] v = String.valueOf(here).split("");
            int next = Integer.parseInt(v[0]);
            here = Integer.parseInt(v[1]);
            if (l1.next != null) {
                l1.next.val += next;
            } else if (l2 != null && l2.next != null) {
                l2.next.val += next;
                l1.next = l2.next;
                l2.next = null;
            } else {
                l1.next = new ListNode();
                l1.next.val += next;
            }
        }
        if (l1.next == null && l2 != null) {
            l1.next = l2.next;
            l2.next = null;
        }
        l1.val = here;
        if (l1.next != null && l2 != null) {
            addTwoNumbers(l1.next, l2.next);
        } else if (l1.next != null) {
            addTwoNumbers(l1.next, l2);
        }
        return l1;
    }

}
