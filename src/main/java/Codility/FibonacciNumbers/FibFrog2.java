package Codility.FibonacciNumbers;

public class FibFrog2 {

    // dynamic approach
    // for each cell we memorize the minimal amount of jumps based on the previous cells minimal jumps
    public int solution(int[] a) {
        final int[] fib = new int[a.length < 2 ? 2 : a.length + 1];
        fib[0] = 0;
        fib[1] = 1;
        int fs = 2;
        while (fib[fs - 1] <= a.length) {
            fib[fs] = fib[fs - 1] + fib[fs - 2];
            fs++;
        }
        int result = -1;
        for (int i = 0; i <= a.length; i++) {
            if (i == a.length || a[i] == 1) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < fs && fib[j] <= i + 1; j++) {
                    final int from = i - fib[j];
                    if (from == -1) {
                        min = 1;
                    } else if (a[from] > 0) {
                        if ((a[from] + 1 < min)) {
                            min = a[from] + 1;
                        }
                    }
                }

                if (i < a.length) { // true
                    if (min == Integer.MAX_VALUE) {
                        a[i] = 0;
                    } else {
                        a[i] = min;
                    }
                } else {
                    if (min != Integer.MAX_VALUE) {
                        result = min;
                    }
                }

            }
        }
        return result;
    }

//    A[0] = 0
//    A[1] = 0
//    A[2] = 0
//    A[3] = 0
//    A[4] = 1
//    A[5] = 0
//    A[6] = 1
//    A[7] = 0
//    A[8] = 0
//    A[9] = 0
//    A[10] = 0


}