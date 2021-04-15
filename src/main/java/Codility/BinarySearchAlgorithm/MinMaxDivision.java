package Codility.BinarySearchAlgorithm;

public class MinMaxDivision {

//    For example, you are given integers K = 3, M = 5 and array A such that:
//
//    A[0] = 2
//    A[1] = 1
//    A[2] = 5
//    A[3] = 1
//    A[4] = 2
//    A[5] = 2
//    A[6] = 2


    // blocks of K
    // Every element of the array is not greater than M

    public int solution(int K, int M, int[] A) {

        int minSum = 0;
        int maxSum = 0;
        for (int i = 0; i < A.length; i++) {
            maxSum = maxSum + A[i]; // sum of all elements
            minSum = Math.max(minSum, A[i]); // at least one max element
        }

        int possibleResult = maxSum;

        while (minSum <= maxSum) {
            // define "mid" (binary search)
            int midSum = (minSum + maxSum) / 2;

            // check if it can be divided by using
            // the minMaxSum = "mid", into K blocks ?
            boolean ok = checkDivisable(midSum, K, A);

            if (ok == true) {
                possibleResult = midSum; // mid is "ok"
                // we can try "smaller"
                maxSum = midSum - 1;
            } else { // not ok
                // we have to try bigger
                minSum = midSum + 1;
            }
            // go back to "binary search" until "min > max"

        }

        return possibleResult;
    }

    // check if it can be divided by using the minMaxSum = "mid", into K blocks ?
    public boolean checkDivisable(int mid, int k, int[] a) {
        int numBlockAllowed = k;
        int currentBlockSum = 0;

        for (int i = 0; i < a.length; i++) {
            currentBlockSum = currentBlockSum + a[i];

            if (currentBlockSum > mid) {
                numBlockAllowed--;
                currentBlockSum = a[i]; // note: next block
            }

            if (numBlockAllowed == 0) {
                return false; // cannot achieve minMaxSum = "mid"
            }
        }

        // can achieve minMaxSum = "mid"
        return true;
        
    }


}