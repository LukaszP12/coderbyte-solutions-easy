package Coderbyte;


import java.util.HashMap;
import java.util.Map;

public class BasicRomanNumerals {

//    The numerals being used are:
//    I for 1, V for 5, X for 10, L for 50, C for 100, D for 500 and M for 1000.

    public static String BasicRomanNumerals(String str) {
        Map<Character, Integer> romans = new HashMap<Character, Integer>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        char[] chars = str.toCharArray();
        int res = romans.get(chars[chars.length - 1]); // last number cannot be compared with next one

        for (int i = 0; i < chars.length - 1; i++) {

            if (romans.get(chars[i]) < romans.get(chars[i + 1])) {
                res -= romans.get(chars[i]); // we remove from the overall sum
            } else {
                res += romans.get(chars[i]);
            }
        }

        return String.valueOf(res);
    }


    public static void main(String[] args) {
        System.out.println(BasicRomanNumerals("IV"));
        System.out.println(BasicRomanNumerals("XLVI"));

        Map<Character, Integer> romans = new HashMap<Character, Integer>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
    }

}
