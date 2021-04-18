package Coderbyte.Medium;

public class RunLength2 {

    public static String RunLength(String str) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            int count = 1;
            while (i + count < str.length() && letter == str.charAt(i + count)) {
                count++;
            }
            result.append(count + "" + letter);
            i = count - 1 + i;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(RunLength("aabbcde"));
    }

}
