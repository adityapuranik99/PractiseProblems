package LinkedLists;

public class linkedListArb {
    class Node {
        int data;
        Node next, arb;

        Node(int d) {
            data = d;
            next = arb = null;

        }
    }

    void clone(Node head) {
        Node curr = head, temp;
        while (curr != null) {
            temp = curr.next;

            curr.next = new Node(curr.data);
            curr.next.next = temp;
            curr = temp;
        }
        curr = head;
        while (curr != null) {
            if (curr.next != null) {
                curr.next.arb = (curr.arb != null) ? curr.arb.next : curr.arb;
                curr.next = (curr.next != null) ? curr.next.next : curr.next;
            }
        }
        Node original = head, copy = head.next;
        temp = copy;
        while (original != null && copy != null) {
            original.next = (original.next != null) ? original.next.next : original.next;
            copy.next = (copy.next != null) ? copy.next.next : copy.next;
            original = original.next;
            copy = copy.next;
        }
        return temp;
    }
}