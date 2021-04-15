package Codility.CaterpillarMethod;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctSlices_SimpleLowPerformance {

    // Count the number of distinct slices (containing only unique numbers).

// An integer M and a non-empty array A consisting of N non-negative integers are given.
// All integers in array A are less than or equal to M.


//    A pair of integers (P, Q), such that 0 ≤ P ≤ Q < N, is called a slice of array A.
//    The slice consists of the elements A[P], A[P + 1], ..., A[Q].
//    A distinct slice is a slice consisting of only unique numbers.
//    That is, no individual number occurs more than once in the slice.

    public static int solution(int M, int[] A) {
        Set<Integer> set = new HashSet<>();

        int leftEnd = 0;
        int rightEnd = 0;
        int numDistinct = 0;

        while (leftEnd < A.length) {
            rightEnd = leftEnd; // for each time, rightEnd begins at leftEnd
            while (rightEnd < A.length) {
                if (set.contains( A[rightEnd]) == false){ //  distinct cases
                    numDistinct++;

                    if(numDistinct == 1_000_000_000)
                        return 1_000_000_000;

                    set.add(A[rightEnd]);
                } else {
                    break;
                }
                rightEnd++;
            }

            set.clear();
            leftEnd++;
        }

        return numDistinct;
    }


    public static void main(String[] args) {
        int A[] = {3,4,5,5,2};
        System.out.println(solution(6,A));
    }

}
