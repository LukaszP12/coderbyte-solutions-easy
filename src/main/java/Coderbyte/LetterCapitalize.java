package Coderbyte;

public class LetterCapitalize {

    public static String LetterCapitalize(String str) {

        String split[] = str.split(" ");
        StringBuilder sb = new StringBuilder();

        sb.append(Character.toUpperCase(split[0].charAt(0)));
        sb.append(split[0].substring(1, split[0].length()));

        for (int i = 1; i < split.length; i++) {
            sb.append(" ");
            sb.append(Character.toUpperCase(split[i].charAt(0)));
            sb.append(split[i].substring(1, split[i].length()));
        }


        return sb.toString();
    }


    public static void main(String[] args) {
        String hello = "hello world";

        System.out.println(LetterCapitalize(hello));
    }

}
