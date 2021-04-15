package Codility.Leader;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {

    public static int solution(int[] A) {

        if (A.length == 0) {
            return 0;
        }

        // 1. find the leader of an array
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], map.get(A[i]) + 1);
            }
        }

        // max_Value and max_Count
        int max_Value = A[0];
        int max_Count = 1;

        for (int j : map.keySet()) {
            int cur_count = map.get(j);
            if (cur_count > max_Count) {
                max_Count = cur_count;
                max_Value = j;
            }
        }

        // check if there is a leader

        int leader_Value = 0;
        int leader_count = 0;

        if (max_Count > (0.5) * (A.length)) {
            leader_Value = max_Value;
            leader_count = max_Count;
        } else {
            return 0;
        }

        // 2. scan the whole array again
        int num_Equi_leaders = 0; // number of equi leaders
        int left_Leader_Count = 0; // number of leaders in left side

        // scan the array
        for (int i = 0; i < A.length; i++) {

            // find a leader (in the left side)
            if (A[i] == leader_Value) {
                left_Leader_Count++;
            }

            // if the leader is "a leader in the left side" (more than half)
            if (left_Leader_Count > (0.5) * (i + 1)) {
                // then, check right side
                int right_Leader_Count = leader_count - left_Leader_Count;
                // if the leader is "a leader in the right side" (more than half)
                if (right_Leader_Count > (0.5) * (A.length - i - 1)) {
                    num_Equi_leaders++; // leaders in both sides
                }
            }
        }


        return num_Equi_leaders;
    }

    public static void main(String[] args) {
        int tab[] = {4,3,4,4,4,2};
        System.out.println(solution(tab));
    }

}
