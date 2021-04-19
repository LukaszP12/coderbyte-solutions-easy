package Coderbyte.Medium;

import java.util.HashSet;

public class TripleDouble {

    public static int TripleDouble(int num1, int num2) {
        String num2S = "" + num2;
        String num1S = "" + num1;
        HashSet<String> doubles = new HashSet<>();
        char prev = num2S.charAt(0);
        for (int i = 1; i < num2S.length(); i++) {
            if (num2S.charAt(i) == prev) {
                doubles.add("" + prev + num2S.charAt(i));
            }
            prev = num2S.charAt(i);
        }
        for (String doubleS : doubles) {
            if (num1S.contains(doubleS.charAt(0) + doubleS)) {
                return 1;
            }
        }

        return 0;
    }


    public static void main(String[] args) {
        System.out.println(TripleDouble(465555, 5579));
    }

}
