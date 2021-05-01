package Coderbyte.Medium;

public class PalindromicSubstring {

    public static String PalindromicSubstring(String str) {

        String result = "none";

        int maxLength = 0;

        int length = str.length();
        int leftIndex = 0;
        int rightIndex = 0;

        int j = 1;
        for (int i = 0; i < length; i++) {

            while (j < length && !isPalindrome(str.substring(i, j))) {
                j++;
            }
            if (isPalindrome(str.substring(i, j))) {
                int currentLength = j - i;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    leftIndex = i;
                    rightIndex = j;
                }
            }
            i = j - 1;
        }

        result = str.substring(leftIndex, rightIndex);

        return result;
    }

    public static String PalindromicSubstring2(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String current = str.substring(i, j);
                String reverse = "";
                for (int k = current.length() - 1; k >= 0; k--) {
                    reverse += current.charAt(k);
                    if (current.equals(reverse)) {
                        if (current.length() > result.length()) {
                            result = current;
                        }
                    }
                }
            }
        }
        if (result.equals("") || result.length() <= 2) {
            result = "none";
        }

        return result;
    }

    private static boolean isPalindrome(String string) {
        char[] charArray = string.toCharArray();
        int length = charArray.length;

        for (int i = 0; i < length; i++) {
            if (charArray[i] != charArray[length - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(PalindromicSubstring("hellosannasmith"));
        System.out.println(PalindromicSubstring("abcdefgg"));

        System.out.println(PalindromicSubstring2("abcdefgg"));
        System.out.println(PalindromicSubstring2("abcdefgg"));
    }

}
