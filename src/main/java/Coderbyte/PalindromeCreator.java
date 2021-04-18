package Coderbyte;

public class PalindromeCreator {

    public static String PalindromeCreator(String str) {

        if (isPalindrome(new StringBuilder(str))) {
            return "palindome";
        }
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (i < len && isPalindrome(new StringBuilder(str).replace(i, i + 1, ""))) {
                return str.substring(i, i + 1);
            } else if (i + 1 < len && isPalindrome(new StringBuilder(str).replace(i, i + 2, ""))) {
                return str.substring(i, i + 2);
            }
        }

        return "not possible";
    }

    private static boolean isPalindrome(StringBuilder stringBuilder) {
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) != stringBuilder.charAt(stringBuilder.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(new StringBuilder("kajak")));

        boolean mmop = isPalindrome(new StringBuilder("mmop"));
        System.out.println(mmop);

        // incorrect cases
        String s1 = "racecar";
        String s2 = "vhhgghhgghhk";
        String s3 = "aaaaaa";

        System.out.println(isPalindrome(new StringBuilder("aaaaaa")));

    }

}
