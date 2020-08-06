package BitMagic;

public class GrayToBin {

    int GrayToBinary(int g) {
        int b = 0;
        for (g = g; g > 0; g = g >> 1) {
            b ^= g;
        }
        return b;
    }

    int binToGray(int b) {
        return b ^ (b >> 1);
    }
}