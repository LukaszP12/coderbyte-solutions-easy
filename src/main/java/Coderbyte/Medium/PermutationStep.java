package Coderbyte.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutationStep {

    public static int PermutationStep(int num) {

        String numString = String.valueOf(num);
        char[] charArray = numString.toCharArray();

        int maxDigit = maxDigit(num);
        int maxNumber = createMaxNumber(maxDigit, charArray.length);

        while (num <= maxNumber) {
            num++;
            if (canBeCreatedFromDigits(num, charArray)) {
                return num;
            }
        }

        return -1;
    }

    private static int createMaxNumber(int maxNumber, int length) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append("" + maxNumber);
        }
        return Integer.parseInt(result.toString());
    }

    private static int maxDigit(int num) {
        char[] digitsArray = String.valueOf(num).toCharArray();
        Arrays.sort(digitsArray);

        return Character.getNumericValue(digitsArray[digitsArray.length-1]);
    }

    private static boolean canBeCreatedFromDigits(int num, char[] charArray) {
        char[] charArray1 = String.valueOf(num).toCharArray();// char array with number being checked

        List<Character> charsList = new ArrayList<>();

        Arrays.sort(charArray1);

        for (Character c : charArray) {
            charsList.add(c); // char array is the given number
        }
        Collections.sort(charsList);

        List<Character> removedChars = new ArrayList<>();

        for (int i = 0; i < charArray1.length; i++) {
            if (charsList.contains(charArray1[i])) {
                removedChars.add(charArray1[i]);
            }
            if (removedChars.equals(charsList)) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        System.out.println(PermutationStep(11121));
        System.out.println(PermutationStep(41352));

        // incorrect case
        System.out.println(PermutationStep(897654321));

    }


}
