package Coderbyte;

public class CodelandUsernameValidation {

    public static boolean CodelandUsernameValidation(String str) {
        return validUsername(str);
    }

    public static boolean validUsername(String str) {
        return lengthChecker(str) && startWithAlpha(str) &&
                containAll(str) && hasUnderscoreEnd(str);
    }

    public static boolean lengthChecker(String str) {
        return str.length() > 4 && str.length() < 25;
    }

    public static boolean startWithAlpha(String str) {
        char startChar = str.charAt(0);
        return (startChar >= 'a' && startChar <= 'z') || (startChar >= 'A' && startChar <= 'Z');
    }

    public static boolean containAll(String str) {
        return str.matches("[A-Za-z0-9_]+");
    }

    public static boolean hasUnderscoreEnd(String str) {
        return !(str.charAt(str.length() - 1) == '_');
    }

    public static void main(String[] args) {
        System.out.println(CodelandUsernameValidation("aa_"));
        System.out.println(CodelandUsernameValidation("u__hello_world123"));
    }

}
