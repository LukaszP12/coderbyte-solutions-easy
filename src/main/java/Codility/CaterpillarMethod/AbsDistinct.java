package Codility.CaterpillarMethod;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {

//    A[0] = -5
//    A[1] = -3
//    A[2] = -1
//    A[3] =  0
//    A[4] =  3
//    A[5] =  6

    public static int solution(int[] A){
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int a : A){
            if (!set.contains(Math.abs(a))){
                set.add(Math.abs(a));
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int A[] = {-5,-3,-1,0,3,6};
        System.out.println(solution(A));
    }

}
