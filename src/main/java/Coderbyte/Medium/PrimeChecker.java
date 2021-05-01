package Coderbyte.Medium;

import java.util.ArrayList;
import java.util.List;

public class PrimeChecker {

    public static int PrimeChecker(int num) {
        String numString = "" + num;
        List<String> combinations = new ArrayList<>();

        permute(combinations, "", numString);

        for (String number : combinations) {
            if (checkIfPrime(Integer.parseInt(number))) {
                return 1;
            }
        }

        return 0;
    }

    private static void permute(List<String> permutations, String substring, String str) {
        if (str.length() == 0) {
            permutations.add(substring);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permute(permutations, substring + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
            }
        }

    }

    private static boolean checkIfPrime(int number) {
        int div = number / 2;

        for (int i = 2; i < div; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static int PrimeChecker2(int num) {
        String str = String.valueOf(num);

        List<String> strings = new ArrayList<>();
        printPermutn(str, "", strings);

        for (String word : strings){
            if (checkIfPrime(Integer.parseInt(word))){
                return 1;
            }
        }

        return 0;
    }

    private static void printPermutn(String str, String ans, List<String> list) {

        // if string is empty
        if (str.length() == 0) {
            list.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            //ith character of str
            char ch = str.charAt(i);

            //Rest of the string after excluding
            //the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);

            //recursive call
            printPermutn(ros, ans + ch, list);
        }
    }

    public static void main(String[] args) {
        System.out.println(PrimeChecker(98));
        System.out.println(PrimeChecker(598));

        System.out.println(PrimeChecker2(98));
        System.out.println(PrimeChecker2(598));
    }

}
