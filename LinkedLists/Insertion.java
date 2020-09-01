package LinkedLists;

import java.util.HashMap;
import java.util.HashSet;

class Insertion {
    static Node head;

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    void insertAtBeg(int n) {
        Node temp = new Node(n);
        temp.next = head;
        head = temp;
    }

    void insertAtEnd(int n) {
        Node temp = new Node(n);
        if (head == null) {
            head = temp;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = null;
        return;
    }

    void insertAfter(Node prev_node, int n) {
        if (prev_node == null)
            return;
        Node new_node = new Node(n);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    void insertMiddle(int n) {
        Node new_node = new Node(n);
        if (head == null) {
            head = new_node;
            return;
        }
        Node curr = head;
        int count = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        curr = head;
        int mid = (count % 2 == 0) ? count / 2 : count / 2 + 1;
        while (mid-- > 1) {
            curr = curr.next;
        }
        new_node.next = curr.next;
        curr.next = new_node;
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

        head = prev;
        return head;
    }

    void printlist() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    // Delete without Head Pointer
    void deleteNode(Node node) {
        if (node.next == null)
            return;

        Node temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
    }

    Node reverseInGroups(Node head, int k) {
        Node curr = head;
        Node prev = null, next = null;
        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            ++count;
        }
        if (next != null) {
            Node rest_head = reverseInGroups(next, k);
            head.next = rest_head;
        }
        return prev;
    }

    Node swapkthnode(Node head, int num, int K) {
        // your code here
        if (num < K)
            return head;
        if (2 * K - 1 == num)
            return head;

        Node curr = head;
        Node curr_prev = null;
        for (int i = 0; i < K; i++) {
            curr_prev = curr;
            curr = curr.next;
        }

        Node temp = head;
        Node temp_prev = null;
        for (int i = 0; i < num - K + 1; i++) {
            temp_prev = temp;
            temp = temp.next;
        }

        if (curr_prev != null)
            curr_prev.next = temp;

        if (temp_prev != null)
            temp_prev.next = curr;

        Node mid = curr.next;
        curr.next = temp.next;
        temp.next = mid;

        if (K == 1)
            head = temp;
        if (K == num)
            head = curr;

        return head;
    }

    boolean detectLoop() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    void startingPt() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != head) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if (slow != fast)
            return;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

    }

    static Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node middleEle = returnMiddle(head);
        Node middleNext = middleEle.next;

        middleEle.next = null;

        Node left = mergeSort(middleEle);
        Node right = mergeSort(middleNext);

        Node sorted = sortedMerge(left, right);
        return sorted;
    }

    static Node sortedMerge(Node a, Node b) {
        Node res = null;
        if (a == null)
            return b;
        if (b == null)
            return a;

        if (a.data <= b.data) {
            res = a;
            res.next = sortedMerge(a.next, b);
        } else {
            res = b;
            res.next = sortedMerge(a, b.next);
        }

        return res;
    }

    static Node returnMiddle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static void printListAgain(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static Node removeDuplicates(Node head) {
        HashSet<Integer> hs = new HashSet<>();
        Node last = head;
        Node prev = null;
        while (last != null) {
            if (hs.contains(last.data)) {
                last = last.next;
                prev.next = last;
            } else {
                hs.add(last.data);
                prev = last;
                last = last.next;
            }
        }
        return head;
    }

    static int getNthfromlast(Node head, int n) {
        Node first = head;
        if (first == null)
            return -1;
        for (int i = 0; i < n; i++) {
            if (first == null)
                return -1;
            first = first.next;
        }
        Node second = head;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second.data;
    }

    static int countNodesInLoop(Node head) {
        HashMap<Node, Integer> hm = new HashMap<>();
        int i = 0;

        for (Node curr = head; curr != null; curr = curr.next) {
            if (hm.containsKey(curr))
                return i - hm.get(curr);
            else
                hm.put(curr, i);
            i++;
        }
        return 0;
    }

    static Node rotateLL(Node head, int k) {
        if (k == 0)
            return head;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        curr = head;
        for (int i = 0; i < k; i++) {
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;

        return head;
        // Also revise the clockwise rotation
    }

    static Node pairwiseSwap(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            int temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;
            curr = curr.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Insertion llist = new Insertion();
        llist.insertAtBeg(6);
        llist.insertAtEnd(4);
        llist.insertAtEnd(1);
        llist.insertAtEnd(2);
        llist.insertMiddle(3);
        // System.out.println("The old linked list is: ");
        // llist.printlist();
        // llist.reverseLL();
        // System.out.println("The new linked list is: ");
        // llist.printlist();
        // Node del = head.next.next;
        // llist.deleteNode(del);
        // System.out.println();
        // llist.printlist();
        // llist.reverseInGroups(head, 2);
        // System.out.println(head.data);
        Node newHead = mergeSort(head);
        printListAgain(newHead);
    }
}