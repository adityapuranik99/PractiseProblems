package Heaps;

public class Heap {
    int[] arr;
    int size, cap;

    Heap(int c) {
        cap = c;
        size = 0;
        arr = new int[c];
    }

    int left(int n) {
        return (2 * n + 1);
    }

    int right(int n) {
        return (2 * n + 2);
    }

    int parent(int n) {
        return (int) Math.floor((n + 1) / 2);
    }

    void insert(int x)
    {
        if(size == cap)
            return ;
        size++;
        arr[size-1]=x;
        for(int i = size - 1; i != 0 && arr[parent(i)] > arr[i])
        {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    void minHeapify(int i) {
        int smallest = arr[i];
        int lt = left(i), rt = right(i);
        if (lt < size && arr[lt] < arr[i])
            lt = smallest;
        if (rt < size && arr[rt] < arr[i])
            rt = smallest;
        if (smallest != i) {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;
            minHeapify(smallest);
        }
    }

    int extractMin() {
        if (size == 0)
            return Integer.MIN_VALUE;
        if (size == 1) {
            int n = arr[0];
            size--;
            return n;
        }
        int temp = arr[size - 1];
        arr[size - 1] = arr[0];
        arr[0] = temp;
        size--;
        minHeapify(0);
        return arr[size];
    }

    void decreaseKey(int i, int x) {
        arr[i] = x;
        while (i >= 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[parent(i)];
            arr[parent(i)] = arr[i];
            arr[i] = temp;
            i = parent(i);
        }
    }

    void heapSort(int arr[], int n) {

    }
}

// To decrease key:
// 1. We first replace value with the value given to us.
// 2. Then we go on to reduce index to the new one.

// To delete key:
// 1. We first of all decrease the key of the given node like decreaseKey(3,
// -INF)
// 2. Then in the second step, we extract the minimum.