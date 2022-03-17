package Coderbyte.Easy;

import java.util.Collections;
import java.util.LinkedList;

public class MovingMedian_M {

    public static String movingMedian(int[] arr) {
        int medianSize = arr[0];

        String medianNumbers = "";
        LinkedList<Integer> nums = new LinkedList<>();

        medianNumbers += "" + arr[1];

        for (int i = 2; i < medianSize + 1 && i < arr.length; i++) {
            medianNumbers += "," + countMedian(nums);
        }

        for (int i = medianSize + 1; i < arr.length; i++) {
            nums.add(arr[i]);
            nums.remove(0);
            medianNumbers += "," + countMedian(nums);
        }

        return medianNumbers;
    }

    private static int countMedian(LinkedList<Integer> nums) {
        LinkedList<Integer> sortNumbers = new LinkedList<>();

        for (int i = 0; i < nums.size(); i++) {
            sortNumbers.add(nums.get(i));
        }
        Collections.sort(sortNumbers);

        if (sortNumbers.size() % 2 == 1) {
            int index = sortNumbers.size() / 2;
            return nums.get(index);
        } else {
            int index = sortNumbers.size() / 2;
            int index1 = (sortNumbers.size() / 2) + 1;
            int firstNum = sortNumbers.get(index);
            int secondNum = sortNumbers.get(index1);

            return ((firstNum + secondNum) / 2);
        }

    }

    public static void main(String[] args) {
        int[] ints = {5, 2, 4, 6};
        System.out.println(movingMedian(ints));

        int[] ints1 = {3, 0, 0, -2, 0, 2, 0, -2};
        System.out.println(movingMedian(ints1));
    }
}