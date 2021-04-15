package Coderbyte;

import java.util.Arrays;

public class LargestFour {

    public static int LargestFour(int[] arr) {

        Arrays.sort(arr);

        if (arr.length < 4){
            return Arrays.stream(arr).sum();
        }

        return arr[arr.length-1] + arr[arr.length-2] + arr[arr.length-3] + arr[arr.length-4];
    }

    public static void main(String[] args) {
        int[] ints = {1, 1, 1, -5};
        System.out.println(LargestFour(ints));

        int[] ints1 = {0, 0, 2, 3, 7, 1};
        System.out.println(LargestFour(ints1));
    }

}
