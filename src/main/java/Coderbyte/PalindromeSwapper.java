package Coderbyte;

public class PalindromeSwapper {

    public static String PalindromeSwapper(String str) {

        int strLength = str.length();

        for (int i = 0; i < strLength; i++) {
            if (i < strLength - 2 && isPalindrome(swapChars(str, i, i + 1))) {
                return swapChars(str, i, i + 1);
            }
        }

        return "-1";
    }

    private static String swapChars(String str, int a, int b) {
        char c = str.charAt(a);
        char c1 = str.charAt(b);
        int strLength = str.length();

        String swapped = c1 + "" + c;

        String substring1 = str.substring(0, a);
        String substring2 = str.substring(b + 1, strLength);

        return substring1 + swapped + substring2;
    }

    private static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(PalindromeSwapper("anna"));
        System.out.println(PalindromeSwapper("kyaak"));
        System.out.println(PalindromeSwapper("rcaecar"));

    }

}
