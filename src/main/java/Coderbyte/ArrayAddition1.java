package Coderbyte;

import java.util.Arrays;


// toDo code not working

public class ArrayAddition1 {

    public static int ArrayAdditionI(int[] arr) {
        int maxOfArray = findMaxOfArray(arr);
        boolean result = anySeqEqualToMax(arr, maxOfArray);

        return result ? 1 : 0;
    }

    private static boolean anySeqEqualToMax(int[] arr, int max) {


        for (int a : arr) {

            if (max == 0)
                return true;

            if (a != max && a - max > 0) {
                max -= a;
            }
        }

        return false;
    }

    private static int findMaxOfArray(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int a : arr) {
            if (max < a) {
                max = a;
            }
        }

        return max;
    }


    public static void main(String[] args) {
        int[] arr = {5, 7, 16, 1, 2};
        System.out.println(ArrayAdditionI(arr));
    }


}