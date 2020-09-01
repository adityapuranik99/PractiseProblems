package InterviewWiseImportant;

public class linkedListcycle {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    boolean isCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    static Node returnMiddle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        Node newSlow = reverse(slow);
        Node copynewSlow = newSlow;
        slow = head;
        Node slow1 = newSlow;
        while (slow != null && slow1 != null) {
            if (slow.data != slow1.data)
                break;
            slow = slow.next;
            slow1 = slow1.next;
        }

        reverse(copynewSlow);
        if (slow == null || slow1 == null)
            return true;
        return false;
    }

    Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
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
}