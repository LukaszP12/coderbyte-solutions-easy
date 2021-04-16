package Coderbyte;

public class DifferentCases {

//    take the str parameter being passed
//    and return it in upper camel case format
//    where the first letter of each word is capitalized.

    public static String DifferentCases(String str) {
        String[] split = str.split("[^A-Za-z]");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0;i<split.length;i++){
            int currentLength = split[i].length();
            System.out.println(split[i]);
            stringBuilder.append(split[i].substring(0,1).toUpperCase());
            stringBuilder.append(split[i].substring(1,currentLength).toLowerCase());
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println("CatsAndDogsAreAwesome".equals(DifferentCases("cats AND*Dogs-are Awesome")));
        System.out.println(DifferentCases("a b c d-e-f%g"));
    }

}
