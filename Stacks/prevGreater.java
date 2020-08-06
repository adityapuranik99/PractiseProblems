package Stacks;

import java.util.*;

public class prevGreater {
    int[] prevGreat(int n, int arr[]) {
        Stack<Integer> s = new Stack<Integer>();
        int[] prev = new int[n];
        s.push(arr[0]);
        prev[0] = -1;
        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && arr[i] > s.peek()) {
                s.pop();
            }
            prev[i] = (s.isEmpty()) ? -1 : s.peek();
            s.push(arr[i]);
        }
        return prev;
    }
}