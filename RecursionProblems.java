class Recursion {
    public static void main(String[] args) {
        int n = 5;
        int a = 2;
        int b = 5;
        int c = 1;
        System.out.print(maxCuts(n, a, b, c));
    }

    // Basic function to print n numbers
    static void PrintNos(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        PrintNos(n - 1);
    }

    // Count the no. of digits in a number
    static int CountDigit(int n) {
        if (n < 1)
            return 0;

        return 1 + CountDigit(n / 10);
    }

    // Print 1 to n in tail recursive
    static void PrintTail(int n, int k) {
        if (n == 0)
            return;
        System.out.print(k + " ");
        PrintTail(n - 1, k + 1);
    }

    // String is Palindrome or not
    static Boolean isPal(String str, int s, int e) {
        if (s == e)
            return true;
        while (s < e) {
            if (str.charAt(s) == str.charAt(e)) {
                return isPal(str, s + 1, e - 1);
            }
        }
        return false;
    }

    // Josepher's Problem, given n people k th person is killed in each iteration

    static int jose(int n, int k) {
        if (n == 1)
            return n;
        return (((jose(n - 1, k) + k - 1) % n + 1));
    }

    // Function to find sum of digits
    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;

        return n % 10 + sumOfDigits(n / 10);
    }

    // Given a rope of length n, you need to find the max. no of pieces
    static int maxCuts(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;

        int res = max(maxCuts(n - a, a, b, c), maxCuts(n - b, a, b, c), maxCuts(n - c, a, b, c));

        if (res == -1)
            return -1;
        else
            return res + 1;
    }

    // Maximum of three nums, Temporary function as a subset of another question

    static int max(int a, int b, int c) {
        int max = a;
        if (b > a) {
            max = b;
            if (c > b)
                max = c;
        }
        if (c > a)
            max = c;
        return max;
    }

    // Given a string print all the subsets
    static void subSet(String str, String curr, int index) {
        if (index < str.length()) {
            subSet(str, curr, index + 1);
            subSet(str, curr += (str.charAt(index)), index + 1);
        } else {
            System.out.println(curr);
            return;
        }
    }
}