package Codility.TimeComplexity;

public class TapeEquilibrium2 {

    public static int solution(int[] A) {

        int smallestDifferent = Integer.MAX_VALUE;

        int[] sumArray = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            if (i > 0) {
                sumArray[i] = sumArray[i - 1] + A[i];
            } else {
                sumArray[i] = A[i];
            }
        }

            for (int j = 0; j < sumArray.length - 1; j++) {
                int secondHalf = sumArray[sumArray.length - 1] - sumArray[j];
                smallestDifferent = Math.min(smallestDifferent,Math.abs(sumArray[j] - secondHalf));
            }

        return smallestDifferent;
    }


}