class Recursion {
    public static void main(String[] args) {
        int k = 0;
        String str = "abcba";
        int n = str.length() - 1;
        if (isPal(str, k, n))
            System.out.print("True");
        else
            System.out.print("False");
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
}