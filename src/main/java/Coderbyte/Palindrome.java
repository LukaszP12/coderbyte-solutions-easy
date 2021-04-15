package Coderbyte;

public class Palindrome {

    public static String Palindrome(String str) {
        String s = str.replaceAll("\\s", "");
        String[] split = s.split("");

        int i = 0;
        int j = split.length - 1;

        while (i <= j) {
            if (split[i] != split[j]) {
                return "false";
            }

            i++;
            j--;
        }

        // code goes here
        return "true";
    }


    public static void main(String[] args) {
        System.out.println(Palindrome("never odd or even"));
        System.out.println(Palindrome("eye"));
    }

}
