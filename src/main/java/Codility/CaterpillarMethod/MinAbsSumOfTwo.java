package Codility.CaterpillarMethod;


//Find the minimal absolute value of a sum of two elements.

import java.util.Arrays;

public class MinAbsSumOfTwo {

//    Let A be a non-empty array consisting of N integers.
//    The abs sum of two for a pair of indices (P, Q) is the absolute value |A[P] + A[Q]|, for 0 ≤ P ≤ Q < N.

    public static int solution(int[] A) {
        int N = A.length;
        Arrays.sort(A);
        int tail = 0;
        int head = N - 1;
        int minAbsSum = Math.abs(A[tail] + A[head]);
        while (tail <= head) {
            int currentSum = A[tail] + A[head];
            minAbsSum = Math.min(minAbsSum, Math.abs(currentSum));
            // If the sum has become
            // positive, we should know that the head can be moved left
            if (currentSum <= 0)
                tail++;
            else
                head--;
        }

        return minAbsSum;
    }


    public static void main(String[] args) {

    }

}
