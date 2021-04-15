package Codility.Sorting;

import java.util.Arrays;

public class MaxProductOfThree {

    public static int solution(int[] A){
        Arrays.sort(A);

        int possibleMax = A[A.length - 1] * A[A.length - 2] * A[A.length - 3]; // if all are positive
        int possibleMax2 = A[0] * A[1] * A[A.length - 1]; // considering two negatives and biggest positive

        int maxResult = Math.max(possibleMax, possibleMax2);

        return maxResult;
    }

    public static void main(String[] args) {
        int A[] = {-3,1,2,-2,5,6};
        System.out.println(solution(A));
    }

}
