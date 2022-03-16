package Coderbyte.Easy;

public class PalindromeCreator_M {

    public static String PalindromeCreator(String str) {

        if (isPalindrome(str)) {
            return "palindrome";
        }

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            // if the reduntant letter is last
            if (isPalindrome(str.substring(0, str.length() - 1))) {
                result += str.charAt(str.length() - 1) + "";
                return result;
            }

            String currStr = str.substring(0, i) + str.substring(i + 1);

            if (isPalindrome(currStr)) {
                result += str.charAt(i) + "";
                return result;
            }

            for (int j = i; j < currStr.length(); j++) {
                String nextStr = currStr.substring(0, j) + currStr.substring(j + 1);
                if (isPalindrome(nextStr) && result.length() == 0) {
                    result = "" + str.charAt(i) + currStr.charAt(j);
                    return result;
                }

            }
        }

        if (result.equals("")) return "not possible";

        return result;
    }

    private static boolean isPalindrome(String str) {
        if (str.length() < 3) {
            return false;
        }

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String mmop = "mmop";
        System.out.println(PalindromeCreator(mmop));

        String kjjjhjjj = "kjjjhjjj";
        System.out.println(PalindromeCreator(kjjjhjjj));

        String abjchba = "abjchba";
        System.out.println(PalindromeCreator(abjchba));

        String annak1 = "annak";
        System.out.println(PalindromeCreator(annak1));

        String aaabaaaj1 = "aaabaaaj";
        System.out.println(PalindromeCreator(aaabaaaj1));

        String nkayak = "nkayak";
        System.out.println(PalindromeCreator(nkayak));

        //toDo it does not work when 2 chars are adjecent to each
        // and when they are at one of the ends
        String aajgmaa = "aajgmaa";
        String aaabaaaj = "aaabaaaj";
        String vhhgghhgghhk = "vhhgghhgghhk";
        String annak = "annak";
        String lolkm = "lolkm";

    }
}
