package Coderbyte.Medium;

public class RunLength {

    public static String RunLength(String str) {

        StringBuilder stringBuilder = new StringBuilder();

        if (str.length() == 1) {
            stringBuilder.append(1 + "" + str.charAt(0));
            return stringBuilder.toString();
        }

        int counter = 1;
        for (int i = 0; i <= str.length() - 1; i++) {

            if (i == str.length() - 1 && str.charAt(i - 1) == str.charAt(i)) {
                stringBuilder.append(counter + "" + str.charAt(i));
            } else if (i == str.length() - 1 && str.charAt(i - 1) != str.charAt(i)) {
                stringBuilder.append(1 + "" + str.charAt(i));
            }

            if (i != str.length() - 1) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    counter++;
                } else if (str.charAt(i) != str.charAt(i + 1)) {
                    stringBuilder.append(counter + "" + str.charAt(i));
                    counter = 1;
                }
            }
        }

        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        // incorrect cases
        String aabbcc = "aabbcc";
        System.out.println(RunLength(aabbcc));
        String coolthree = "coolthree";
        System.out.println(RunLength(coolthree));
        System.out.println(RunLength("abqq"));
        System.out.println(RunLength("s"));
    }

}
