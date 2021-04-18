package Coderbyte.Medium;

import java.sql.Date;
import java.util.*;

public class MinWindowSubstring {

    public static String MinWindowSubstring(String[] strArr) {
        String N = strArr[0];
        String K = strArr[1];
        int min = Integer.MAX_VALUE;
        String result = "";
        for (int i = 0; i < N.length(); i++) {
            StringBuilder match = new StringBuilder();
            for (int j = i; j < N.length(); j++) {
                if (match.toString().contains("" + N.charAt(j))) {
                    int index = match.indexOf("" + N.charAt(j));
                    match.replace(index, index + 1, "");
                }

                if (match.length() == 0) {
                    if (j - i < min) {
                        min = j - i;
                        result = N.substring(i, j + 1);
                    }
                    break;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        String[] strings = {"ahffaksfajeeubsne", "jefaa"};
        String[] strings1 = {"aaffhkksemckelloe", "fhea"};

        System.out.println(MinWindowSubstring(strings));
        System.out.println(MinWindowSubstring(strings1));



    }

}