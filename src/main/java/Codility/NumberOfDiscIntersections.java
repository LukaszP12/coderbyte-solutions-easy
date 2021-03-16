package Codility;

import java.util.Arrays;

public class NumberOfDiscIntersections {

    public int solution(int[] A){

        // store all the "lower points" and "upper points" of the discs
        // count the intersections

        long[] lower = new long[A.length];
        long[] upper = new long[A.length];

        for(int i=0; i<A.length; i++) {
            lower[i] = i - (long) A[i];
            upper[i] = i + (long) A[i];
        }

            Arrays.sort(upper);
            Arrays.sort(lower);

            int intersection = 0; // number of intersections
            int j=0; // for the lower points

            //scan the upper points
            for (int i=0; i<A.length; i++){

            }

            return 0;
        }

    }

