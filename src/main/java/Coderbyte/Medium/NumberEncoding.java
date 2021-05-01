package Coderbyte.Medium;

public class NumberEncoding {

    public static String NumberEncoding(String str) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = alphabets.indexOf(c);
            if (num == -1) {
                sb.append(c);
            } else {
                sb.append(num + 1);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(NumberEncoding("hello 45"));
        System.out.println(NumberEncoding("jaj-a"));
    }

}
