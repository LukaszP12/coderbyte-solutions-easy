package Codility.CountingElements;

public class MaxCountersJavaStart {

    public static int[] solution(int N, int[] A){
        int[] result = new int[N];

        int level = 0;
        int max = 0;
        boolean prevMax = false;

        for (int i : A) {
            if (i <= N) {
                result[i - 1]++;
                max = Math.max(max, result[i - 1]);
                prevMax = false;
            } else if (i == N + 1 && !prevMax) {
                level = level + max;
                max = 0;
                result = new int[N];
                prevMax = true;
            }
        }

        for (int i=0;i<N;i++){
            result[i] += level;
        }

        return result;
    }

    public static void main(String[] args) {
        int A[] = {3,4,4,6,1,4,4};

    }

}

