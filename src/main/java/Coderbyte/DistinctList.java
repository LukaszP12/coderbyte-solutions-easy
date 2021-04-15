package Coderbyte;

import java.util.Arrays;

public class DistinctList {

    public static int DistinctList(int[] arr) {

        Arrays.sort(arr);

        int duplicateCounter = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]){
                duplicateCounter++;
            }
        }

        return duplicateCounter;
    }


    public static void main(String[] args) {
        int[] ints = {0, -2, -2, 5, 5, 5};
        System.out.println(DistinctList(ints));

        int[] ints1 = {100, 2, 101, 4};
        System.out.println(DistinctList(ints1));
    }

}
