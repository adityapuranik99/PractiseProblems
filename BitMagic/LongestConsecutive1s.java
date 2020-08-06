package BitMagic;

public class LongestConsecutive1s {

    int longest1s(int x) {
        int count = 0;
        while (x != 0) {
            x &= (x << 1);
            count++;
        }
        return count;
    }
}