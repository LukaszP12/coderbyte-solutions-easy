package Coderbyte;

public class Palindrome2 {

    public static String Palindrome(String str) {

        String s = str.replaceAll("\\s", "");

        String reversed = reverse(s);

        boolean result = s.equals(reversed);

        return result ? "true" : "false";
    }


    private static String reverse(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String reversed = stringBuilder.reverse().toString();

        return reversed;
    }


    public static void main(String[] args) {
        String s = "never odd or even".replaceAll("\\s", "");
        System.out.println(s);

        System.out.println(Palindrome("never odd or even"));
        System.out.println(Palindrome("eye"));
    }

}
