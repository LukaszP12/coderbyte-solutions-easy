package Coderbyte;

public class DivisionStringified {

    public static String DivisionStringified(int num1, int num2) {
        int quotient = (num1 + num2 / 2) / num2;
        String qstring = Integer.toString(quotient);
        String newstring = "";
        for (int i = 0; i < qstring.length(); i++) {
            if ((qstring.length() - i) % 3 == 0 && i != 0 && qstring.charAt(i - 1) != '-') {
                newstring += ",";
            }
            newstring += qstring.charAt(i);
        }

        return newstring;
    }


    public static void main(String[] args) {
        System.out.println(DivisionStringified(8, 4));
        System.out.println(DivisionStringified(15, 4));
    }

}
