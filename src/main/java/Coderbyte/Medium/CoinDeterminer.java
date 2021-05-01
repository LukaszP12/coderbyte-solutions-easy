package Coderbyte.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CoinDeterminer {

// coins representing the integers 1, 5, 7, 9, and 11.

    public static int CoinDeterminer(int num) {
        //int[] ints = new int[] { 1, 5, 7, 9, 11 };
        int[] ints = new int[]{11, 9, 7, 5, 1};
        List<Integer> counts = new ArrayList<Integer>();
        calculate(num, 0, 0, counts, ints);
        Collections.sort(counts);

        return counts.get(0);
    }

    private static void calculate(int num, int total, int count, List<Integer> counts, int[] ints) {
        if (total > num) {
            return;
        }
        if (total == num) {
            counts.add(count);
            return;
        }
        for (int i = 0; i < ints.length; i++) {
            calculate(num, total + ints[i], count + 1, counts, ints);
        }
    }

    public static void main(String[] args) {
        System.out.println(CoinDeterminer(6));
        System.out.println(CoinDeterminer(16));

        // incorrect case 100
    }

}
