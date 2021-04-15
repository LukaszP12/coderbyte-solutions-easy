package Coderbyte;

public class FirstReverse {

    public static String firstReverse(String str) {

        String result = "";

        for (int i = 1; i <= str.length(); i++) {
            result += str.charAt(str.length() - i);
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(firstReverse("coderbyte"));
    }

}
