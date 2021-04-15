package Coderbyte;

public class SimpleSymbols {

    public static String SimpleSymbols(String str) {

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int len = str.length();
            if (Character.isLetter(c)) {
                if ((i == 0) || (i == (len - 1)) || (str.charAt(i - 1) != '+') || (str.charAt(i + 1) != '+')) {
                    return "false";
                }
            }

        }

        return "true";
    }


}
