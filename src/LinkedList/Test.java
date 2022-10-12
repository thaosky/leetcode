package LinkedList;

public class Test {
    public static void main(String[] args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        MyLinkedList.print(head);
        Node n = MyLinkedList.deleteAtIndex(head, 1);
        MyLinkedList.print(n);
    }
}
