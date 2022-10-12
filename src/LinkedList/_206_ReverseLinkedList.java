package LinkedList;

public class _206_ReverseLinkedList {

    /*
        Tạo 3 con trỏ
        - prev
        - current = head
        - nodeNext
     */
    public Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node nodeNext = null;

        // Loop qua list
        while (curr != null) {
            nodeNext = curr.next; // Lưu next
            curr.next = prev; // thay đổi next của current, đảo ngược ở đây.

            // di chuyển prev và curr tiến lên 1 bước
            prev = curr;
            curr = nodeNext;
        }
        return prev;
    }

    public Node reverseListRecursion(Node head) {
        if(head == null) {
            return null;
        }

        // node cuối cùng or chỉ có 1 node
        if(head.next == null) {
            return head;
        }

        Node newHeadNode = reverseListRecursion(head.next);

        head.next.next = head;
        head.next = null;

        // return lại head mới sau mỗi lần đệ quy
        return newHeadNode;
    }
}
