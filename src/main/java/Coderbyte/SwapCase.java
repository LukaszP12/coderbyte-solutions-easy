package Coderbyte;

public class SwapCase {

    public static String SwapCase(String str) {

        StringBuilder newstring = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            char newchar = c;

            if (c <= 'Z' && c >= 'A') {
                newchar = Character.toLowerCase(c);
            } else if (c <= 'z' && c >= 'a'){
                newchar = Character.toUpperCase(c);
            }

            newstring.append(newchar);
        }

        return newstring.toString();
    }


    public static void main(String[] args) {
        System.out.println(SwapCase("Hello-LOL"));
        System.out.println(SwapCase("Sup DUDE!!?"));
    }

}
