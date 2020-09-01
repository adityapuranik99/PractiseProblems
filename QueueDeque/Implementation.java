package QueueDeque;

public class Implementation {
    int size, cap, front;
    int[] arr;

    Implementation(int c) {
        cap = c;
        size = 0;
        arr = new int[c];
        front = 0;
    }

    int getFront() {
        if (size == 0)
            return -1;
        return arr[front];
    }

    int getRear() {
        int rear = (front + size - 1) % cap;
        if (size == 0)
            return -1;
        return arr[rear];
    }

    void enqueue(int x) {
        if (size == cap - 1)
            return;
        int rear = (front + size - 1) % cap;
        rear = (rear + 1) % cap;
        arr[rear] = x;
        size++;
    }

    void dequeue() {
        if (size == 0)
            return;
        front = (front + 1) % cap;
        size--;
    }

}