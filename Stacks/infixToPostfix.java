package Stacks;

import java.util.*;

public class infixToPostfix {

    static int prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    static String inToPost(String exp) {
        String result = new String("");

        Stack<Character> s = new Stack<Character>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c))
                result += c;

            else if (c == '(')
                s.push(c);

            else if (c == ')') {
                while (!s.isEmpty() || s.peek() != '(')
                    result += s.pop();

                if (!s.isEmpty() || s.peek() != '(')
                    return "Invalid Exp";
                else
                    s.pop();
            } else {
                while (!s.isEmpty() && prec(c) <= prec(s.peek())) {
                    result += s.pop();
                    s.push(c);
                }
            }
        }
        while (!s.isEmpty()) {
            result += s.pop();
        }
        return res;
    }
}