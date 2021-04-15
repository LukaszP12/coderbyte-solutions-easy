package Codility.EuclideanAlgorithm;

import java.util.HashSet;
import java.util.Set;

public class ChocolatesByNumbers2 {

    public static int solution(int N, int M) {

        Set<Integer> set = new HashSet<>();

        int currentNumber = 0;
        set.add(currentNumber); // the 1st chocolate
        int numChocolate = 1; // eat the 1st one

        while (true) {
            currentNumber = (currentNumber + M) % N;
            if (set.contains(currentNumber) == true) {
                break;
            } else {
                numChocolate++;
                set.add(currentNumber);
            }
        }

        return numChocolate;
    }


}
