package Contests;

import java.util.*;

public class QueueStacks1 {

    public static ArrayList<Pair> pairingBrackets(String s) {
        // Your code here
        int first = 0, second = 0;
        ArrayList<Pair> al = new ArrayList<Pair>();
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ')') {
                if (st.isEmpty()) {
                    st.push(')');
                    second = i;
                } else {
                    if (st.peek() == '(') {
                        st.pop();
                        int x = first;
                        while (!st.isEmpty()) {
                            st.pop();
                            int y = second;
                            al.add(new Pair(x, y));
                        }
                        st.push(')');
                        second = i;
                    } else {
                        st.push(')');
                        second = i;
                    }

                }
            } else if (s.charAt(i) == '(') {
                if (st.isEmpty())
                    continue;
                else {
                    if (st.peek() == ')') {
                        st.push('(');
                        first = i;
                    } else {
                        first = i;
                    }
                }
            }
        }
        if (st.peek() == '(') {
            st.pop();
            int x = first;
            while (!st.isEmpty()) {
                st.pop();
                int y = second;
                al.add(new Pair(x, y));
                second += 1;
            }
        }
        Collections.reverse(al);
        return al;
    }

}
