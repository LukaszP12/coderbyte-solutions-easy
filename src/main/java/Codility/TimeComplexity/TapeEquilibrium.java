package Codility.TimeComplexity;

public class TapeEquilibrium {

    public static int solution(int[] A) {

        int smallestDifference = Integer.MAX_VALUE;

        // first sum from left to right
        int sumArray[] = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (i > 0) {
                sumArray[i] = sumArray[i - 1] + A[i]; // not +=
            } else {
                sumArray[i] = A[i];
            }
        }

        for (int j = 0; j < sumArray.length; j++) {
            int secondHalf = sumArray[sumArray.length - 1] - sumArray[j];

            smallestDifference = Math.min(smallestDifference, Math.abs(secondHalf - sumArray[j]));
        }

        return smallestDifference;
    }

    public static void main(String[] args) {
        int A[] = {3,1,2,4,3};
        System.out.println(solution(A));

        int B[] = {-1000,1000}; // still wrong
        System.out.println(solution(B));
    }

}