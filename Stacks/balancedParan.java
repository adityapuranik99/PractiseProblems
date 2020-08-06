package Stacks;

import java.util.Stack;

public class balancedParan {

    boolean isBalanced(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else {
                if (s.isEmpty()) {
                    return true;
                } else if (matching(str.charAt(i), s.peek()) == false)
                    return false;
                else
                    s.pop();
            }
        }
        return (s.isEmpty() == true);
    }

    boolean matching(char a, char b) {
        return (a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']');
    }
}