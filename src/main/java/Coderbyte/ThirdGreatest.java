package Coderbyte;

import java.util.Arrays;

public class ThirdGreatest {

    public static void main(String[] args) {

        String[] strings2 = {"byte", "code", "dyte"};
        String s = ThirdGreatest(strings2);
        System.out.println(s);

        String[] strings3 = {"byte", "code", "dyte", "eyte", "fyte", "gyte"};
        String s1 = ThirdGreatest(strings3);
        System.out.println(s1);

        String[] strings = {"coder", "byte", "code"};
        String s2 = ThirdGreatest(strings);
        System.out.println(s2);


        String[] strings1 = {"hello", "world", "world"};
        String s3 = ThirdGreatest(strings1);
        System.out.println(s3);

        String[] strings4 = {"a", "bc", "def"};
        String s4 = ThirdGreatest(strings4);
        System.out.println(s4);

        int biggestFromEndIndex = getBiggestFromEndIndex(strings4, 2);
        System.out.println(biggestFromEndIndex);

        String[] strings5 = {"two", "three", "four"};
        System.out.println(ThirdGreatest(strings5));

        String[] strings6 = {"a", "bcd", "efgdggc"};
        System.out.println(ThirdGreatest(strings6));

    }

    public static String ThirdGreatest(String[] strArr) {
        String[] strings1 = sortStringArray(strArr);
        int biggestFromEndIndex1 = getBiggestFromEndIndex(strings1, 2);

        return strArr[biggestFromEndIndex1];
    }

    // method works for sorted array
    private static int getBiggestFromEndIndex(String[] strings, int n) {


        if (allEqual(strings)){
            return strings.length - 3;
        }

        int j = 0;
        int currentStringLength = 0;
        int previousStringLength = strings[strings.length-1].length();

        int i = 0;
        for (i = strings.length-1; i >= 1; i--) {
            String currentString = strings[i - 1];
            currentStringLength = currentString.length();

            if (currentStringLength != previousStringLength){
                j++;
                if (j == n){
                    return i+1;
                }
            }

            previousStringLength = currentStringLength;
        }

        if (j<n){
            return i;
        }

        return -1;
    }

    private static boolean allEqual(String[] strings) {
        int previousLength = strings[0].length();
        int currentLength = 0;

        for (int i=1; i<strings.length-1;i++){
            currentLength = strings[i].length();

            if (currentLength!=previousLength){
                return false;
            }

            previousLength = currentLength;
        }

        return true;
    }

    private static String[] sortStringArray(String[] strings) {
        String[] originalStrings = strings.clone();

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if ((strings[i].length()) > (strings[j].length())) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }

                if ((strings[i].length()) == (strings[j].length())) {
                    if (getIndexOfStringInArray(originalStrings, strings[i]) > getIndexOfStringInArray(originalStrings, strings[j])) {
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }
                }

            }
        }

        return strings;
    }

    private static int getIndexOfStringInArray(String strings[], String s) {
        int i = 0;

        while (i < strings.length) {
            if (strings[i].equals(s)) {
                return i;
            }
            i++;
        }

        return i;
    }

}
