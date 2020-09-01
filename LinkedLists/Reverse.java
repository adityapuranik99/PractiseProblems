package LinkedLists;

public class Reverse {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverseLL() {
        if (head == null) {
            return head;
        }
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}

// curr = head
// prev = null
// while(curr != null)
// 1. temp node = curr.next;
// 2. curr.next = prev;
// 3. Change prev to curr;
// 4. Change curr to temp node;