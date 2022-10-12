package LinkedList;

public class MyLinkedList {
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

    public static Node insertToHead(Node head, int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
        }
        return newNode;
    }

    public static Node insertToTail(Node head, int value) {
        Node newNode = new Node(value);
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return head;
    }

    public static Node insertToIndex(Node head, int index, int val) {

        if (index == 0) {
            return insertToHead(head, val);
        } else {
            Node newNode = new Node(val);
            Node currentNode = head;
            int count = 0;
            while (currentNode.next != null) {
                count++;
                if (count == index) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }
            return head;
        }

    }

    public static Node deleteHead(Node head) {
        if (head != null) {
            head = head.next;
        }
        return head;
    }

    public static Node deleteTail(Node head) {
        Node temp = head;
        Node preNode = null;
        while (temp.next != null) {
            preNode = temp;
            temp = temp.next;
        }
        // Có nghĩa list này chỉ có 1 phần tử, sau khi xóa đi rồi return null
        if (preNode == null) {
            return null;
        }
        preNode.next = null;
        return head;
    }

    public static Node deleteAtIndex(Node head, int index) {
        Node temp = head;
        Node pre = null;
        int count = 0;
        if (head == null || head.next == null || index < 0) {
            return null;
        }
        if (index == 0) {
            head = head.next;
        } else {
            while (temp.next != null) {
                count++;
                pre = temp;
                temp = temp.next;
                if (count == index) {
                    pre.next = temp.next;
                    break;
                }
            }
        }
        return head;
    }

}
