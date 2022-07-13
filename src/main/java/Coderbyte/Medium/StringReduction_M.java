package Coderbyte.Medium;

public class StringReduction_M {

    public static int StringReduction_M(String str) {
        if (allSame(str)) {
            return str.length();
        }

        String result = "";

        while (true) {
            result = "";
            char[] charArray = str.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (i + 1 < str.length() && charArray[i] != charArray[i + 1]) {
                    result += replace(charArray[i], charArray[i + 1]);
                    i++;
                } else {
                    result += "" + charArray[i];
                }
            }

            if (allSame(result)) {
                return result.length();
            }
            str = result;
        }

    }

    private static String replace(char c, char c1) {

        if (c == 'b' && c1 == 'c') {
            return "a";
        }

        if (c == 'a' && c1 == 'c') {
            return "b";
        }

        if (c == 'a' && c1 == 'b') {
            return "c";
        }

        return "";
    }

    private static boolean allSame(String str) {
        if (str.equals("")) {
            return false;
        }

        char firstChar = str.charAt(0);
        String all = str.replaceAll("" + firstChar, "");
        if (all.length() == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(StringReduction_M("abc"));
        System.out.println(StringReduction_M("cccc"));

        // incorrect cases
        System.out.println(StringReduction_M("abcabc"));
//        System.out.println(StringReduction_M("abb"));
//        System.out.println(StringReduction_M("ccaa"));
//        System.out.println(StringReduction_M("abbcb"));
        // cab
        //
    }

}