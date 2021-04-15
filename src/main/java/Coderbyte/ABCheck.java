package Coderbyte;

//Have the function ABCheck(str) take the str parameter being passed and return the string
//true if the characters a and b are separated by exactly 3 places anywhere in the string at least once

public class ABCheck {

    public static String ABCheck(String str) {
        for (int i = 0; i < str.length() - 4; i++) {
            if ((str.charAt(i) == 'a' && str.charAt(i + 4) == 'b') || (str.charAt(i) == 'b' && str.charAt(i + 4) == 'a')) {
                return "true";
            }
        }

        return "false";
    }


    public static void main(String[] args) {
        System.out.println(ABCheck("after badly"));
        System.out.println(ABCheck("Laura sobs"));
    }

}
