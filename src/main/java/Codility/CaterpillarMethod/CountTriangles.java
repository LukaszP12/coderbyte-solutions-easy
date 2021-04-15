package Codility.CaterpillarMethod;

import java.util.Arrays;

//Count the number of triangles that can be built from a given set of edges.

// 1, 3, 5, 7, 9

public class CountTriangles {

    public static int solution(int[] A){
        int n = A.length;
        int result = 0; // number of triangles

        Arrays.sort(A);

        for(int i=0; i< A.length-2; i++){

            // the leftEnd and the rightEnd of the "Caterpillar"
            int leftEnd = i+1;
            int rightEnd = i+2;

            while (leftEnd < A.length - 1){

                if (rightEnd < A.length && A[i] + A[leftEnd] > A[rightEnd]){
                    rightEnd++;
                } else {
                    // note: need to minus "1"
                    // because the rightEnd is not included
                    result = result + (rightEnd - leftEnd - 1);
                    leftEnd++; // decrease the Caterpillar
                }
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int A[] = {10,2,5,1,8,12};
        System.out.println(solution(A));
    }

}
