package Coderbyte;

import java.util.Scanner;

public class DivisionStringified2 {

    public static String DivisionStringified(int num1, int num2) {
        Integer d = new Integer((int) Math.round(num1 / (double) num2));
        String dStr = d.toString();
        String out = "";
        for (int i = dStr.length(); i > 0; i--) {
            if (i % 3 == 0 && i != 0 && dStr.length() > 3) {
                out += "," + dStr.charAt(dStr.length() - i);
            } else {
                out += dStr.charAt(dStr.length() - i);
            }
        }

        return out;
    }

    public static void main(String[] args) {
        System.out.println(DivisionStringified(5, 2));
        System.out.println(DivisionStringified(6874, 67));

    }

}