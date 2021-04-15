package Coderbyte;

import java.util.ArrayList;
import java.util.List;


//Have the function QuestionsMarks(str) take the str string parameter,
//        which will contain single digit numbers, letters, and question marks,
//        and check if there are exactly 3 question marks between every pair of two numbers that add up to 10.
//        If so, then your program should return the string true, otherwise it should return the string false.
//        If there aren't
//        any two numbers that add up to 10 in the string, then your program should return false as well.

public class QuestionsMarks {


    public static String QuestionsMarks(String str) {
        List<String> pairs = new ArrayList<String>();

        int first = -1;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                if (first == -1)
                    first = i;
                else {
                    if (Character.getNumericValue(str.charAt(first)) +
                            Character.getNumericValue(str.charAt(i)) == 10)
                        pairs.add(str.substring(first + 1, i));
                    first = 1;
                }
        }

        boolean good = false;

        for (String pair : pairs) {
            int count = 0;
            for (int i = 0; i < pair.length(); i++) {
                if (pair.charAt(i) == '?')
                    count++;
            }

            good = true;
            if (count != 3) {
                good = false;
                break;
            }
        }


        return good ? "true" : "false";
    }


    public static void main(String[] args) {
        System.out.println(QuestionsMarks("aa6?9"));
        System.out.println(QuestionsMarks("acc?7??sss?3rr1??????5"));

        // incorrect cases
        System.out.println(QuestionsMarks("9???1???9??1???9"));
        System.out.println(QuestionsMarks("5??aaaaaaaaaaaaaaaaaaa?5?5"));


    }

}
