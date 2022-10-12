package LinkedList;

public class _203_RemoveLinkedListElement {
    public static void main(String[] args) {
        Node head = new Node(7);
        Node node1 = new Node(7);
        Node node2 = new Node(7);
        Node node3 = new Node(7);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        removeElements(head, 7);
        print(head);
    }

    public static void print(Node head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Using loop
    public static Node removeElements(Node head, int val) {
        if (head == null) {
            return null;
        }

        Node dummy = new Node();
        dummy.next = head;
        Node cur = head;
        Node prev = dummy;

        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

    // Using recursion
    public static Node removeElements1(Node head, int val) {
        if (head == null) {
            return null;
        }
        Node next = removeElements1(head.next, val);
        if (head.val == val) {
            return next;
        }
        return head;
    }
}
