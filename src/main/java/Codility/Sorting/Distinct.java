package Codility.Sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public static int solution(int[] A){
        Set<Integer> setCount = new HashSet<>();

        for (int a : A){
            setCount.add(a);
        }

        int count = (int) setCount.stream().count();
        return count;
    }

    public static void main(String[] args) {
        int A[] = {2,1,1,2,3,1};
        System.out.println(solution(A));
    }

}
