package Codility.CountingElements;

public class MaxCounters2 {

    public static int[] solution(int N,int[] A) {

        int[] result = new int[N];

        int maxValue = 0;
        int level = 0;
        boolean prevMax = false;

        for (int a : A) {
            if (a <=  N) {
                result[a - 1]++;
                maxValue = Math.max(maxValue, result[a-1]);
                prevMax = false;
            } else if (a == N + 1 && !prevMax) {
                level = level + maxValue;
                maxValue = 0;
                result = new int[N];
                prevMax = true;
            }
        }

        for (int i = 0; i < N; i++) {
            result[i] += level;
        }

        return result;
    }


    public static void main(String[] args) {
        int A[] = {3, 4, 4, 6, 1, 4, 4};
        int[] solutionResult = solution(5,A);
        
        for (int s : solutionResult) {
            System.out.println(s);
        }

        System.out.println("New result");

        int A1[] = {1};
        int[] solution1 = solution(1, A1);
        for (int s : solution1){
            System.out.println(s);
        }
    }

}
