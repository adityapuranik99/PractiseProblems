package Stacks;

public class StackImplementationArray {

    int top = -1;

    void push(int x) {
        if (top != cap - 1) {
            top++;
            arr[top] = x;
        }
    }

    int pop() {
        if (top == -1) {
            return -1;
        }
        int res = arr[top];
        top--;
        return res;
    }
}

class linkedListImplementation {
    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
    }

    int pop() {
        if (head == null) {
            return -1;
        }
        int res = head.data;
        Node temp = head;
        head = head.next;
        return res;
    }
}