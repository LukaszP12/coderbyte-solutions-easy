package Codility.CountingElements;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public static int solution(int[] A){

        if (A.length == 0){
            return 1;
        }

        Set<Integer> set = new HashSet<>();

        for (int a : A){
            set.add(a);
        }

        for (int i=1; i<A.length; i++){
            if (set.contains(i) != true){
                return i;
            }
        }

        return A.length+1;
    }

    public static void main(String[] args) {
        int A[] = {1,2,3};
        System.out.println(solution(A));

        int B[] = {-1,-3};
        System.out.println(solution(B));

        int C[] = {1,2,3,4,5};
        System.out.println(solution(C));
    }

}
