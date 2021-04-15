package Codility.Leader;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

    public static int solution(int[] A){

        Map<Integer, Integer> map = new HashMap<>();

        // 1. counting
        for (int a : A) {
            if (!map.containsKey(a)) {
                map.put(a, 1);
            } else {
                int count = map.get(a);
                map.put(a,count+1);
            }
        }

        // 2. find the max number of counts
        int max_Number =0;
        int max_Count =0;

        for (int key : map.keySet()){
            int cur_Count = map.get(key);
            if (cur_Count > max_Count){
                max_Count = cur_Count;
                max_Number = key;
            }
        }

        // 3. check if there is a dominator or not
        if (max_Count > (A.length)/2 ){

        } else {
            return -1; // no dominator
        }
        // 4. return "any index" of "the dominator"
        for (int i=0; i<A.length;i++){
            if (A[i] == max_Number){
                return i;
            }
        }
        ;

        return -1;
    }

    public static void main(String[] args) {
        int A[] = {3,4,3,2,3,-1,3,3};
        System.out.println(A[solution(A)]);
    }


    //toDo Solution with O(n) time complexity

}
