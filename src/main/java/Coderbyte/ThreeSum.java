package Coderbyte;

public class ThreeSum {

    public static boolean ThreeSum(int[] arr) {
        boolean result = false;
        int firstNumber = arr[0];
        int sum = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                for (int h = 1; h < arr.length; h++) {
                    sum = 0;
                    if (i != j && j != h) {
                        sum += (arr[i] + arr[j] + arr[h]);
                        if (sum == firstNumber){
                            result = true;
                            break;
                        }
                    }
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] ints = {10, 2, 3, 1, 5, 3, 1, 4, -4, -3, -2};
        System.out.println(ThreeSum(ints));

        int[] ints1 = {12, 3, 1, -5, -4, 7};
        System.out.println(ThreeSum(ints1));
    }

}
