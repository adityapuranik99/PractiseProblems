package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class findAll {
    static HashMap<Integer, Integer> mp = new HashMap<>();

    public static void findAllNos() {
        int num = 1, num2;
        ArrayList<Integer> al = new ArrayList<>();
        int j = 1;
        al.add(j);
        al.add(j + 1);
        al.add(j + 2);
        mp.put(j, 1);
        mp.put(j + 1, 1);
        mp.put(j + 2, 1);
        j = 0;
        while (num <= 1000000) {
            num2 = al.get(j++);

            if ((num2 * 10 + 1) <= 1000000) {
                al.add(num2 * 10 + 1);
                mp.put(num2 * 10 + 1, 1);
            }

            if ((num2 * 10 + 2) <= 1000000) {
                al.add(num2 * 10 + 2);
                mp.put(num2 * 10 + 2, 1);
            }

            num2 = num2 * 10 + 3;

            if (num2 <= 1000000) {
                al.add(num2);
                mp.put(num2, 1);
            }

            num = num2;
        }
    }
}