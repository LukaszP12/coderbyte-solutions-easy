package Codility.MaximumSliceProblem;

public class MaxProfit {

    //write a function, which returns the max possible profit
    public static int solution(int[] A) {

        if (A.length <= 1) return 0; // no profit possible

        // two variables (and initial settings)
        int minPrice = A[0];
        int maxProfit = 0;

        // one pass solution
        for (int i = 1; i < A.length; i++) {
            if (A[i] < minPrice) {
                minPrice = A[i];
            } else {
                int curProfit = A[i] - minPrice;
                if (curProfit > maxProfit) {
                    maxProfit = curProfit;
                }
            }
        }

        return maxProfit;
    }


    public static void main(String[] args) {
        int A[] = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(solution(A));
    }
}