package Codility.PrefixSums;

public class MinAvgTwoSlice2 {

    public int solution(int[] A) {
        // find the minimum average
        int N = A.length;
        double minAvg = Integer.MAX_VALUE;
        double sum = 0;
        int result = 0;

        for (int i = 0; i < N - 1; i++) {
            sum = A[i];

            for (int j = i + 1; j < i + 3 && j < N; j++) {
                sum += A[j];
                double avg = (sum / (j - i + 1)); // czemu + 1 ?, np. (A[1] + A[2]) / 2 - 1 + 1
                // musimy też uwzględnić wcześniejszy kawełek
                if (avg < minAvg) {
                    minAvg = avg;
                    result = i;
                }
            }
        }

        return result;
    }

}
