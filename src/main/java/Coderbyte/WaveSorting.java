package Coderbyte;

import java.util.Arrays;

public class WaveSorting {

    public static String WaveSorting(int[] arr) {
        Arrays.sort(arr);

        int half = (int) arr.length / 2;

        for (int i=0;i<half;i++){
            if (arr[i] >= arr[i+half]){
                return "false";
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 4, 1, 1, 1};
    }

}
