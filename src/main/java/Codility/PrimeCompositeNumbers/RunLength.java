package Codility.PrimeCompositeNumbers;

public class RunLength {


    public static String RunLength(String str) {

        if (str.length() == 1) {
            return "1" + str.charAt(0);
        }
        String runLength = "";
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                runLength += "" + count + str.charAt(i - 1);
                count = 1;
            }
        }
        runLength += "" + count + str.charAt(str.length() - 1);

        return runLength;
    }

    public static void main(String[] args) {
        System.out.println(RunLength("aabbcde"));
    }

}