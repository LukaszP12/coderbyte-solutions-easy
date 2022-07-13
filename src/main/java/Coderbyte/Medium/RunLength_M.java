package Coderbyte.Medium;

public class RunLength_M {

    public static String RunLength(String str) {

        String result = "";
        int count = 1;

        if (str.length() == 1) {
            return "" + 1 + str.charAt(0);
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }

            if (str.charAt(i) != str.charAt(i + 1)) {
                result += "" + count + str.charAt(i);
                count = 1;
            }
        }

        if (count > 1) {
            result += "" + count + str.charAt(str.length() - 1);
        }

        if (str.charAt(str.length() - 1) != str.charAt(str.length() - 2)) {
            result += "" + count + str.charAt(str.length() - 1);
        }


        return result;
    }

    public static void main(String[] args) {
        String aabbcde = "aabbcde";
        System.out.println(RunLength(aabbcde));

        String wwwbbbw = "wwwbbbw";
        System.out.println(RunLength(wwwbbbw));

        String aabbcc = "aabbcc";
        System.out.println(RunLength(aabbcc));

        String aaaaaaabbbeiiiiggggg = "aaaaaaabbbeiiiiggggg";
        System.out.println(RunLength(aaaaaaabbbeiiiiggggg));

        String coolthree = "coolthree";
        System.out.println(RunLength(coolthree));
    }

}
