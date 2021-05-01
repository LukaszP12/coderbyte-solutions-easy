package Coderbyte.Medium;

import java.text.DecimalFormat;

public class FormattedDivision {

    public static String FormattedDivision(int num1, int num2) {
        double f = (double) num1 / num2;
        DecimalFormat df = new DecimalFormat("#,###,##0.0000");
        return ""+ df.format(f);
    }

    public static void main(String[] args) {
        System.out.println(FormattedDivision(2,3));
        System.out.println(FormattedDivision(10,10));
    }

}
