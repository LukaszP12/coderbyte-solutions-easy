package Codility.Sorting;

public class NumberOfDiscIntersections_SimpleLowPerformance {

        public int solution(int[] A){
        // main idea:
        // 1. store all the "lower points" and "upper points" of the discs
        // 2. count the intersections (if one upper point "is bigger than or equal to" one lower point)

            long[] lower = new long[A.length];
            long[] upper = new long[A.length];

            for (int i=0; i<A.length; i++){
                lower[i] = i - (long)A[i];
                upper[i] = i + (long)A[i];
            }

            int intersection = 0; // number of intersections

            for (int i=0; i<A.length; i++){
                // note: compare "i" with "j": need to set "j=i+1" (avoid double counting)
                for(int j=i+1; j<A.length;j++){
                    if (upper[i]>=lower[j]){
                        intersection++;
                    }
                }
            }

            // for the overflow cases
            if(intersection > 10_000_000)
                return -1;

            return intersection;
        }


}
