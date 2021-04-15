package Coderbyte;

import java.util.HashMap;
import java.util.Map;

// toDo only letters should considered

public class LongestWord {
    final static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    final static String ALPHABET_UPPER = ALPHABET.toUpperCase();


    public static String longestWord(String sen) {

        int maxWordSize = 0;
        int counter = 0;

        StringBuilder stringTemp = new StringBuilder();
        String longestWord = null;

        for (int i = 0; i < sen.length(); i++) {

            if ((sen.charAt(i) != ' ') && (checkIfLetter(sen.charAt(i))) ) {
                counter++;
                stringTemp.append(sen.charAt(i));
            } else {
                if (counter > maxWordSize) {
                    maxWordSize = counter;
                    longestWord = stringTemp.toString();
                }

                stringTemp = new StringBuilder();
                counter = 0;
            }
        }

        return longestWord;
    }

    private static boolean checkIfLetter(char c) {
        if (ALPHABET.contains("" + c) || ALPHABET_UPPER.contains("" + c)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(longestWord("I love dogs"));
        System.out.println(longestWord("fun&!! time")); // toDo it is still wrong returns "fun" instead of time
    }

}
