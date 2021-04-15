package Coderbyte;

import java.util.Arrays;

public class SecondGreatLow {

    public static String SecondGreatLow(int[] arr) {

        String stringResult = "";

        if (arr.length == 0) {
            return stringResult = "This is a empty array, cannot pick secondLowest";
        }

        if (arr.length == 1) {
            return stringResult = "Array has to be of length at least 2";
        }

        int[] result = new int[2];

        Arrays.sort(arr);

        result[0] = arr[1];
        result[1] = arr[arr.length - 2];


        if (checkIfAllTheElementsAreTheSame(arr)) {
            stringResult += "" + arr[0];
            return stringResult += " " + arr[0];
        }

        if (checkIfAppearsMoreThanOnce(arr[0], arr)) {
            int lastAppearanceIndex = getLastAppearanceIndex(arr[0], arr, true);
            result[0] = arr[lastAppearanceIndex + 1];
        }

        if (checkIfAppearsMoreThanOnce(arr[arr.length - 1], arr)) {
            int lastAppearanceIndex1 = getLastAppearanceIndex(arr[arr.length - 1], arr, false);
            result[1] = arr[lastAppearanceIndex1 - 1];
        }

        stringResult = result[0] + " " + result[1];


        return stringResult;
    }


    private static boolean checkIfAllTheElementsAreTheSame(int[] arr) {
        int counter = 0;
        int i = 0;

        int a = arr[0];

        while (i < arr.length && arr[i] == a) {
            counter++;
            i++;
        }

        if (arr.length == counter) {
            return true;
        }

        return false;
    }

    private static boolean checkIfAppearsMoreThanOnce(int a, int[] arr) {
        int counter = 0;

        int i = 0;

        while (i < arr.length) {
            if (arr[i] == a) {
                counter++;
            }
            i++;
        }

        return (counter > 1) ? true : false;
    }

    private static int getLastAppearanceIndex(int a, int[] arr, boolean fromBegin) {

        if (fromBegin) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == a && arr[i + 1] == a) {
                    continue;
                } else {
                    return i;
                }
            }
        } else if (!fromBegin) {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == a && arr[i - 1] == a) {
                    continue;
                } else {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4};
        System.out.println(SecondGreatLow(ints));

        int[] ints1 = {1, 1, 1, 2, 3, 4, 5, 6};
        System.out.println(SecondGreatLow(ints1));

        int[] ints2 = {1, 1, 1, 2, 4, 6, 6, 6};
        System.out.println(SecondGreatLow(ints2));


        int[] allElementsTheSame = {2, 2, 2, 2};
        System.out.println(SecondGreatLow(allElementsTheSame));

        int[] emptyArray = {};
        System.out.println(SecondGreatLow(emptyArray));

        int[] size2Array = {1};
        System.out.println(SecondGreatLow(size2Array));

    }

}
