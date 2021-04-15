package Codility.CaterpillarMethod;

public class CountDistinctSlices {

//    A[0] = 3
//    A[1] = 4
//    A[2] = 5   // leftEnd
//    A[3] = 5   // rightEnd
//    A[4] = 2

        // M is the greatest number among the array
    public static int solution(int M, int[] A) {
        // main idea:
        // use "boolean[]" to record if an integer is already seen
        // also use "leftEnd" and "rightEnd"
        boolean[] seen = new boolean[M + 1];

        int leftEnd = 0;
        int rightEnd = 0;
        int numSlice = 0;

        // key point: move the "leftEnd" and "rightEnd" of a slice
        while (leftEnd < A.length && rightEnd < A.length) {
            // case 1: distinct (rightEnd)
            if (seen[A[rightEnd]] == false) {
                // note: not just +1
                // there could be (rightEnd - leftEnd + 1) combinations (be careful)
                numSlice = numSlice + (rightEnd - leftEnd + 1);
                if (numSlice >= 1_000_000_000)
                    return 1_000_000_000;

                // increase the slice to right by "1" (important)
                seen[A[rightEnd]] = true;
                rightEnd++;
            } else {
                // case 2: not distinct
                seen[A[leftEnd]] = false;
                leftEnd++;
            }
        }

        return numSlice;
    }
}
