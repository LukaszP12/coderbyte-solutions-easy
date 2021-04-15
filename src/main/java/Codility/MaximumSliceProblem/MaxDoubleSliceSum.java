package Codility.MaximumSliceProblem;

import java.util.logging.Logger;

public class MaxDoubleSliceSum {
//    Find the maximal sum of any double slice.

    public static int solution(int[] A) {
        int N = A.length;
        if (N == 3) {
            return 0;
        }
        int maxEnding = 0;
        int maxSlice = 0;
        // stores the sum value of max slice of A[1] A[2] .. A[i] in maxSliceLeft[i]
        int[] maxSliceLeft = new int[N];
        for (int i = 1; i < N - 1; i++) {
            maxEnding = Math.max(0, maxEnding + A[i]);
            maxSliceLeft[i] = maxEnding;
        }

        // stores the sum value of max slice of A[N-2] A[N-1] ... A[i] in maxSliceRight[i]
        int[] maxSliceRight = new int[N];
        maxEnding = 0;
        maxSlice = 0;
        for (int i = N - 2; i >= 1; i--) {
            maxEnding = Math.max(0, maxEnding + A[i]);
            maxSliceRight[i] = maxEnding;
        }
        int maxDoubleSlice = 0;
        // calculate the max double slice from Y == 1 to Y == N-2
        for (int i = 1; i < N - 1; i++) {
            maxDoubleSlice = Math.max(maxDoubleSlice, maxSliceLeft[i - 1] + maxSliceRight[i + 1]);
        }

        return maxDoubleSlice;
    }

    public static void main(String[] args) {
        int A[] = {3,2,6,-1,4,5,-1,2};
        System.out.println(solution(A));
    }

}