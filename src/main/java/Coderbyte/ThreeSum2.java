package Coderbyte;

import java.util.Arrays;

public class ThreeSum2 {

    public static String ThreeSum(int[] arr) {
        if (arr.length == 0) return "false";

        Arrays.sort(arr, 1, arr.length);

        int target = arr[0];

        for (int i = 1; i < arr.length - 2; i++) {
            int curr = arr[i];
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int sum = curr + arr[start] + arr[end];
                if (sum == target) return "true";
                else if (sum < target) start++;
                else end--;
            }
        }

        return "false";
    }

    public static void main(String[] args) {
        int[] ints = {10, 2, 3, 1, 5, 3, 1, 4, -4, -3, -2};
        System.out.println(ThreeSum(ints));

        int[] ints1 = {12, 3, 1, -5, -4, 7};
        System.out.println(ThreeSum(ints1));
    }

}
