package Codility.Arrays;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public static int solution(int[] A){

        Map<Integer,Integer> map = new HashMap<>();

        for (int a : A){
            map.put(a,map.getOrDefault(a,0) + 1);
        }

        map.entrySet()
                .removeIf( entry -> (entry.getValue()%2 == 0));

        Integer[] resultTab = map.keySet().toArray(new Integer[0]);

        int result = resultTab[0].intValue();

        return result;
    }

    public static void main(String[] args) {
        int A[] = {9,3,9,3,9,7,9};
        System.out.println(solution(A));

    }

}
