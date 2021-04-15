package Codility.CountingElements;

public class MaxCounters {

    public static int[] solution(int N, int[] A){
        int[] result = new int[N];
        int maxCount = 0;

        for (int a : A) {
            if (a < N) {
                result[a - 1]++;
            } else {
                for (int i=0;i<A.length;i++){
                    A[i] = 0;
                }

                maxCount++;
            }
        }

        for (int j = 0; j < A.length * maxCount; j++) {
            result[j%N]++;
        }


        return result;
    }

    public static void main(String[] args) {
        int[] A = {3,4,4,6,1,4,4};
        System.out.println(solution(A.length,A).toString());
    }

}
