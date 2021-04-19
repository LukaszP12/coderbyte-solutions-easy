package Coderbyte.Medium;

import java.util.*;

import static java.util.stream.Collectors.toSet;

public class Consecutive {

    public static int Consecutive(int[] arr) {
        Arrays.sort(arr);

        return arr[arr.length - 1] - arr[0] - arr.length + 1;
    }


    public static void main(String[] args) {
        int[] ints = {5, 10, 15};
        System.out.println(Consecutive(ints));

        int[] ints1 = {-2, 10, 4};
        System.out.println(Consecutive(ints1));
    }

}
