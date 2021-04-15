package Codility.PrefixSums;

public class MinAvgTwoSlice {

//    The goal is to find the starting position of a slice whose average is minimal.


//    that, given a non-empty array A consisting of N integers,
//    returns the starting position of the slice with the minimal average.
//    If there is more than one slice with a minimal average,
//    you should return the smallest starting position of such a slice.
//
//

    public int solution(int[] A){
        float min = Integer.MAX_VALUE;
        int min_start_position = 0; // to store the start position

        for (int i=0; i<A.length-2; i++){

            float avg_2 = (float) (A[i] + A[i + 1]) / 2;
            float avg_3 = (float) (A[i] + A[i + 1] + A[i + 2]) / 3;

            float cur_min_avg = Math.min(avg_2,avg_3);

            if (cur_min_avg < min){
                min = cur_min_avg;
                min_start_position = i;
            }
        }

        int avg_2 = (A[A.length - 2]) + A[A.length - 1] / 2;

        if (avg_2 < min){
            min = avg_2;
            min_start_position = A.length-2;
        }

        return min_start_position;
    }

}
