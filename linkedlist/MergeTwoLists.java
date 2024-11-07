package linkedlist;

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode sol = new ListNode();
        return merge(list1, list2, sol, sol.next);
    }

    private ListNode merge(ListNode list1, ListNode list2, ListNode sol, ListNode next) {
        if (list1 == null && list2 == null) {
            return sol;
        }


        if (next == null) {
            next = sol;
        }

        if (list2 == null) {
            next.val = list1.val;
            list1 = list1.next;
        } else if (list1 == null) {
            next.val = list2.val;
            list2 = list2.next;
        } else if (list1.val < list2.val) {
            next.val = list1.val;
            list1 = list1.next;
        } else {
            next.val = list2.val;
            list2 = list2.next;
        }
        if (!(list1 == null && list2 == null)) {
            next.next = new ListNode();
        }
        return merge(list1, list2, sol, next.next);
    }

}
