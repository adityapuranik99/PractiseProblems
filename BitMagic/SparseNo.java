package BitMagic;

public class SparseNo {
    static boolean isSparse(int n) {
        if ((n & (n >> 1)) >= 1)
            return false;
        return true;
    }
}