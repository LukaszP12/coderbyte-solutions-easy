package Coderbyte.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAddition {

    public static int ArrayAddition(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return arr[0];
    }

    public static boolean sumUp(int sum, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sum) {
                continue;
            }

            if (Math.abs(sum - arr[i]) >= 0) {
                sum -= arr[i];
            } else {
                continue;
            }

            if (sum == 0) {
                return true;
            }
        }

        return false;
    }


    public static String ArrayAddition2(int[] arr) {
        Arrays.sort(arr);
        int shift = 0;
        if (arr[0] < 0) {
            shift = -arr[0];
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            numbers.add(arr[i] + shift);
        }

        int remaining = numbers.remove(arr.length-1);

        while(numbers.size() > 0){
            for(int i = numbers.size()-1; i >= 0; i--){
                //Find the largest remaining number and subtract it from the remaining, without going below zero
                if(remaining >= numbers.get(i)){
                    //Subtracting this number is possible. Subtract and continue with the next one.
                    remaining -= numbers.get(i);
                }
            }
            if(remaining == 0){
                return "true";
            }
            else{
                //It wasn't possible to subtract the numbers without going below zero... remove largest element and try again
                numbers.remove(numbers.size()-1);
                remaining = arr[arr.length-1] + shift; //Reset
            }
        }

        return "false"; //No more elements

    }

    public static void main(String[] args) {
        int[] ints = {5, 7, 16, 1, 2};
        System.out.println(sumUp(16, ints));

        int[] ints1 = {3, 5, -1, 8, 12};
        System.out.println(sumUp(12, ints1));
    }

}
