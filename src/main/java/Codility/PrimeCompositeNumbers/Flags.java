package Codility.PrimeCompositeNumbers;

import java.util.ArrayList;

public class Flags {

    public static int solution(int[] A) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i + 1] < A[i]) {
                array.add(i); // peaks array
                // array stores the indexes of peakes
            }
        }

        if (array.size() == 1 || array.size() == 0) {
            return array.size();
        }

        int sf = 1;
        int ef = array.size();
        int result = 1;
        while (sf <= ef) {
            int flag = (sf + ef) / 2;
            boolean suc = false;
            int used = 0;
            int mark = array.get(0);
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) >= mark) {
                    used++;
                    mark = array.get(i) + flag;
                    if (used == flag) {
                        suc = true;
                        break;
                    }
                }
            }
            // if n flags can be set, then it can be possible to set more
            if (suc) {
                result = flag;
                sf = flag + 1;
            } else {
                ef = flag - 1;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int A[] = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        System.out.println("How many flags can be placed: " + solution(A));
    }

}
