package BitMagic;

public class swapEvenOdd {

    int swap(int n) {
        int even_bits = n & 0xAAAAAAAA;
        int odd_bits = n & 0x55555555;
        even_bits >>= 1;
        odd_bits <<= 1;
        return (even_bits | odd_bits);
    }
}