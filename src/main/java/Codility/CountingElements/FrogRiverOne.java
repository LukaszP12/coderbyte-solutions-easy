package Codility.CountingElements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static int solution(int X, int[] A){
        Set set = new HashSet();

        for (int i=1;i<=X; i++){
            set.add(i);
        }

        int i = 0;
        for (int a : A){
            set.remove(a);
            if (set.isEmpty()){
                return i;
            }
            i++;
        }

        return -1;
    }


    public static void main(String[] args) {
        int A[] = {1,3,1,4,2,3,5,4};
        System.out.println(solution(5,A));
    }

}
