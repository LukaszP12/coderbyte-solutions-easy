package Coderbyte;

import java.util.Arrays;

public class SumMultiplier {

    public static String SumMultiplier(int[] arr) {
        int doubleSum = Arrays.stream(arr).sum() * 2;

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){

                if(i!=j && arr[i]*arr[j]>doubleSum){
                    return "true";
                }
            }
        }

        return "false";
    }


    public static void main(String[] args) {
        int[] ints = {2, 2, 2, 2, 4, 1};
        System.out.println(SumMultiplier(ints));

        int[] ints1 = {1, 1, 2, 10, 3, 1, 12};
        System.out.println(SumMultiplier(ints1));
    }

}
