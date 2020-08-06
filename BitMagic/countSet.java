package BitMagic;

public class countSet {

    int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }

    int noOfBitsFlipped(int a, int b) {
        return countSetBits(a ^ b);
    }
}