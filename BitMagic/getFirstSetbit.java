package BitMagic;

public class getFirstSetbit {

    int getFirst(int n) {
        if (n == 0)
            return 0;
        return (int) ((Math.log10(n & -n) / Math.log10(2)) + 1);
    }

    int righMostDiffBit(int a, int b) {
        return getFirst(a ^ b);
    }
}