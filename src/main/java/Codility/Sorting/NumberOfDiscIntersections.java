package Codility.Sorting;

import java.util.Arrays;

public class NumberOfDiscIntersections {

    public static int solution(int[] A) {

        // store all the "lower points" and "upper points" of the discs
        // count the intersections

        long[] lower = new long[A.length];
        long[] upper = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            lower[i] = i - (long) A[i];
            upper[i] = i + (long) A[i];
        }

        Arrays.sort(upper);
        Arrays.sort(lower);


        int intersection = 0; // number of intersections
        int j = 0; // for the lower points

        //scan the upper points
        for (int i = 0; i < A.length; i++) {
            while (j < A.length && upper[i] >= lower[j]) {
                intersection = intersection + j; // add j intersections
                intersection = intersection - i; // minus "i" (avoid double count)
                j++;
            }
        }

        // for the overflow cases
        if (intersection > 10_000_000)
            return -1;

        return intersection;
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 2, 1, 4, 0};
        solution(A);
    }

}