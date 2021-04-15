package Codility.Arrays;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray1 {

    public static int solution(int A[]){
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int a : A){
            if (!set.contains(a)){
                set.add(a);
                sum += a;
            }else if (set.contains(a)){
                set.remove(a);
                sum -= a;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int A[] = {9,3,9,3,9,7,9};
        System.out.println(solution(A));
    }

}
