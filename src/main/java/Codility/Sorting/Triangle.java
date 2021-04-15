package Codility.Sorting;

import java.util.Arrays;

public class Triangle {

    public static int solution(int[] A){
        Arrays.sort(A);

        for(int i=2; i<A.length; i++) {
            // condition (A[i+1] + A[i+2] > A[i] is obvious, ones the elements are sorted
            if ( (A[i-2] + A[i-1] > A[i]) ){
                return 1;
            }

        }

        return 0;
    }

    public static void main(String[] args) {
        int A[] = {10,2,5,1,8,20};

    }

}
