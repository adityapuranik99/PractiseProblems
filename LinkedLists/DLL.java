package LinkedLists;

public class DLL {
    Node head;

    class Node {
        int data;
        Node prev, next;

        Node(int d) {
            data = d;
            prev = next = null;
        }
    }

    void append(int n) {
        Node new_node = new Node(n);
        if (head == null) {
            head = new_node;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        new_node.prev = last;
    }

    void printList() {
        if (head == null)
            return;
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.append(6);
        list.append(3);
        list.append(1);
        list.printList();
    }
}