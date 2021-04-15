package Coderbyte;

import java.util.Arrays;

public class MeanMode {

    public static int MeanMode(int[] arr) {
        Arrays.sort(arr);

        if (arr[getMeanIndex(arr)] == getMode(arr)) {
            return 1;
        }

        return 0;
    }

    private static int getMode(int[] arr) {
        double sum = 0;

        for (int a : arr) {
            sum += a;
        }

        double mode = sum / arr.length;
        Math.round(mode);

        return (int) mode;
    }

    //toDo get mean method does not appear to be working correctly
    //check if all number are equals in appearance

    private static int getMeanIndex(int[] arr) {

        int maxCount = Integer.MIN_VALUE;
        int maxIndex = 0;
        int currentMax = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                currentMax++;
            }

            if (arr[i - 1] != arr[i]) {
                if (currentMax > maxCount) {
                    maxCount = currentMax;
                    currentMax = 0;
                    maxIndex = i - 2;
                }
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        int[] ints2 = {1, 1, 2,2, 3};
        System.out.println(getMeanIndex(ints2));

        int[] ints1 = {4, 4, 4, 6, 2};
        System.out.println(MeanMode(ints1));


        // incorrect outputs
        int[] ints3 = {1, 2, 3, 4};
        System.out.println(MeanMode(ints3));

        int[] ints4 = {10, 10, 10, 2};
        System.out.println(MeanMode(ints4));

        int[] ints5 = {1, 2, 10, 100};
        System.out.println(MeanMode(ints5));

        int[] ints6 = {8, 2, 55};
        System.out.println(MeanMode(ints6));

    }

}
