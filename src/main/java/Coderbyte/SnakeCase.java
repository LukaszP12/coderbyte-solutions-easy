package Coderbyte;

public class SnakeCase {

    public static String SnakeCase(String str) {
        String s = str.replaceAll("[^a-zA-Z]", " ");
        String[] split = s.split(" ");

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < split.length - 1; i++) {
            builder.append(split[i].toLowerCase() + "_");
        }

        builder.append(split[split.length - 1].toLowerCase());

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(SnakeCase("cats AND*Dogs-are Awesome"));
        System.out.println(SnakeCase("a b c d-e-f%g"));
    }

}
