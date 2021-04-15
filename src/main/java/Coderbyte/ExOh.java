package Coderbyte;

import java.util.Arrays;
import java.util.stream.Stream;

public class ExOh {

    public static String ExOh(String str) {

        String[] split = str.split("");

        int count = 0;

        for (String s : split) {
            if (s.equals("x")) {
                count++;
            }
            if (s.equals("o")) {
                count--;
            }
        }

        System.out.println(count);
        if (count == 0) {
            return "true";
        } else {
            return "false";
        }
    }

    public static void main(String[] args) {
        System.out.println(ExOh("xooxxo"));
    }

}
