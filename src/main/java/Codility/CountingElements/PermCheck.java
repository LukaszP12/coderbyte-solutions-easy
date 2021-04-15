package Codility.CountingElements;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public static int solution(int[] A){

        boolean[] result = new boolean[A.length];

        for (int i=0; i<A.length;i++){
            int index = A[i] - 1;
            
            if (index > A.length-1){
                return 0;
            }

            if(!result[index]){
                result[index] = true;
            } else {
                return 0;
            }
        }

        for (int i=0; i<A.length;i++){
            if (!result[i])
                return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        int A[] = {4,1,3};
        solution(A);
    }

}
