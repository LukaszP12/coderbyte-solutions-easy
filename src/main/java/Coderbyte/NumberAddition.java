package Coderbyte;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberAddition {

    public static int NumberAddition(String str) {
        Character[] numbers = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};

        List<Character> digits = Arrays.asList(numbers);

        boolean previousNumber = false;
        int sum = 0;

        StringBuilder number = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (digits.contains(c)) {
                number.append(c);
                previousNumber = true;
            }

            if (!digits.contains(c) && previousNumber) {
                String s = number.toString();
                sum += Integer.parseInt(s);
                previousNumber = false;
                number = new StringBuilder();
            }

            if (!digits.contains(c)) {
                previousNumber = false;
            }

        }

            String s = number.toString();
            if (s.length() > 0){
                sum += Integer.parseInt(s);
            }

        return sum;
    }


    public static void main(String[] args) {
        String s = "75Number9";
        int i = NumberAddition(s);
        System.out.println(i);

        String s1 = "10 2One Number*1*";
        int i1 = NumberAddition(s1);
        System.out.println(i1);

    }

}
