package Coderbyte;

public class NextPalindrome {

    public static int NextPalindrome(int num) {
        int result = 0;
        String reverse = "";
        boolean keepGoing = true;

        while (keepGoing) {
            num++;
            String number = num + "";
            for (int i = number.length() - 1; i >= 0; i--) {
                reverse += number.charAt(i);
                if (reverse.equals(number)) {
                    result = Integer.parseInt(number);
                    keepGoing = false;
                    break;
                }
            }
            reverse = "";
        }

        return result;
    }

    public static void main(String[] args) {

    }

}
