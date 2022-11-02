package recursion;

public class _21_MergeTwoSortedList {
    /**
     * @param list1 list2 2 linked list đã được sắp xếp
     * @return 1 list đc merge từ 2 list trên
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode pointer = result;
        while (list1.next != null && list2.next != null) {
            if (list1.val < list2.val) {
                pointer.next = list1;
                list1 = list1.next;
            } else {
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }
        return result;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
