package Coderbyte;

import java.util.Arrays;

public class ArrayAddition2 {

    public static String ArrayAdditionI(int[] arr) {
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }

        return sum == arr[arr.length - 1] ? "true" : "false";
    }


    public static void main(String[] args) {

    }

}
