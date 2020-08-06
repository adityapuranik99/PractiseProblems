package BitMagic;

public class checkKthBit {

    public static boolean checkKBit(int n, int k) {
        int n1 = 1 << k;
        if ((n & n1) != 0) {
            return true;
        }
        return false;
    }
}