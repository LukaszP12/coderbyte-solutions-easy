package Coderbyte.Medium;

import org.junit.Assert;

public class OffBinary {

    public static int OffBinary(String[] strArr) {
        String firstNumber = strArr[0];
        String secondNumber = strArr[1];
        Integer firstNumberInt = Integer.valueOf(firstNumber);

        String binaryString = intToBinary(firstNumberInt);

        int result = compareBinaryString(binaryString, secondNumber);

        return result;
    }

    private static int compareBinaryString(String string1, String string2) {
        int length = string1.length() > string2.length() ? string2.length() : string1.length();

        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                counter++;
            }
        }

        int diff = Math.abs(string1.length() - string2.length());
        counter = counter + diff;

        return counter;
    }

    private static String intToBinary(int number) {
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            if (number % 2 == 0) {
                result.append(0);
            } else if (number % 2 != 0) {
                result.append(1);
            }
            number = number / 2;
        }

        result.reverse();
        return result.toString();
    }

    public static void main(String[] args) {
        String[] strings = {"5624", "0010111111001"};
        String[] strings1 = {"44", "111111"};

        System.out.println(OffBinary(strings));
        System.out.println(OffBinary(strings1));
    }

}
