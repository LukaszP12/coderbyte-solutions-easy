package Coderbyte;

public class TwoSum {

    public static String TwoSum(int[] arr) {
        int firstNumber = arr[0];

        StringBuilder results = new StringBuilder();

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] + arr[j] == firstNumber) {
                        if (!(results.toString().contains(arr[j]+","+arr[i]))) {
                            results.append(arr[i] + "," + arr[j] + " ");
                        }
                    }
                }
            }
        }

        return (results.toString().length() > 0) ? results.toString() : "-1";
    }

    public static void main(String[] args) {
        int[] ints = {17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7};
        System.out.println(TwoSum(ints));

        int[] ints1 = {7, 6, 4, 1, 7, -2, 3, 12};
        System.out.println(TwoSum(ints1));

        int[] ints2 = {6, 2};
        System.out.println(TwoSum(ints2));
    }

}
