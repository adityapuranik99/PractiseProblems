package QueueDeque;

import java.util.*;

public class QueueTwoStacks {
    static Stack<Integer> s1 = new Stack<Integer>();
    static Stack<Integer> s2 = new Stack<>();

    static void enqueue(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.peek());
            s1.pop();
        }
        s2.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.peek());
            s2.pop();
        }
    }

    static void dequeue() {
        if (s1.isEmpty())
            System.exit(0);
        s1.pop();
    }
}
