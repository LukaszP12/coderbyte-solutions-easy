package Coderbyte;

public class StringMerge {

//    read the str parameter being passed which will contain
//    a large string of alphanumeric characters with a single
//    asterisk character splitting the string evenly into two separate strings

    public static String StringMerge(String str) {
        String[] split = str.split("\\*");

        String comparableLength = split[0];

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < comparableLength.length(); i++) {
            builder.append(split[0].charAt(i) + "" + split[1].charAt(i));
        }

        return builder.toString();
    }

    public static String StringMerge2(String str) {
        StringBuilder result = new StringBuilder();

        String string1 = str.substring(0, str.indexOf("*"));
        String string2 = str.substring(str.indexOf("*") + 1);

        for (int i = 0; i < string1.length(); i++) {
            result.append(string1.charAt(i)+""+string2.charAt(i));
        }

        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(StringMerge("aaa*bbb").equals(StringMerge2("aaa*bbb")));
        System.out.println(StringMerge("123hg*aaabb").equals(StringMerge2("123hg*aaabb")));
    }

}
