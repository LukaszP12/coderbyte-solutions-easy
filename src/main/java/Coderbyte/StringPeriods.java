package Coderbyte;

import java.util.ArrayList;
import java.util.List;

public class StringPeriods {

    public static String StringPeriods(String str) {

        if (str.length() == 1){return "-1";}

        // all characters are the same
        String allSameChars = str.replaceAll(String.valueOf(str.charAt(0)), "");
        if (allSameChars.isEmpty()){
            if (str.length()%2 == 0){
                return str.substring(0,str.length()/2);
            } else if (str.length()%3 == 0){
                return str.substring(0,str.length()/3);
            } else {
                return str.substring(0,1); // prime number
            }
        }

        int finishIndex = getEndIndexOfRepeatingString(str);

        boolean wordRepeated = isWordRepeated(str, finishIndex);

        if (wordRepeated) {
            return str.substring(0, finishIndex);
        } else {
            return "-1";
        }
    }

    private static int getEndIndexOfRepeatingString(String str) {
        int length = str.length();

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, length).contains(str.substring(0, i))) {
                continue;
            } else {
                return i - 1;
            }
        }

        return -1;
    }

    private static boolean isWordRepeated(String str, int finishIndex) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= str.length() - finishIndex; i += finishIndex) {
            stringBuilder.append(str.substring(i, finishIndex + i));
        }

        String result = stringBuilder.toString();

        if (result.equals(str)) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
        System.out.println(StringPeriods("abcababcababcab"));
        System.out.println(StringPeriods("abababababab"));
        System.out.println(StringPeriods("affedaaffed"));
        System.out.println(StringPeriods("gg"));

    }

}
