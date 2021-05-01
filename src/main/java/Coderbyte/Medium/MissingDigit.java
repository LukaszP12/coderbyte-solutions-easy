package Coderbyte.Medium;

public class MissingDigit {

    public static String MissingDigit(String str) {
        String[] exp = str.split(" ");
        String result = exp[4];
        String leftNum1 = exp[0];
        String leftNum2 = exp[2];
        String operator = exp[1];
        String valOfX = "";
        if (leftNum1.contains("x")) {
            switch (operator) {
                case "+":
                    valOfX = findLeftX(Integer.valueOf(result) - Integer.valueOf(leftNum2), leftNum1);
                    break;
                case "-":
                    valOfX = findLeftX(Integer.valueOf(result) + Integer.valueOf(leftNum2), leftNum1);
                    break;
                case "*":
                    valOfX = findLeftX(Integer.valueOf(result) / Integer.valueOf(leftNum2), leftNum1);
                    break;
                case "/":
                    valOfX = findLeftX(Integer.valueOf(result) * Integer.valueOf(leftNum2), leftNum1);
                    break;
            }

        }
        if (leftNum2.contains("x")) {
            switch (operator) {
                case "+":
                    valOfX = findLeftX(Integer.valueOf(result) - Integer.valueOf(leftNum1), leftNum2);
                    break;
                case "-":
                    valOfX = findLeftX(Integer.valueOf(leftNum1) - Integer.valueOf(result), leftNum2);
                    break;
                case "/":
                    valOfX = findLeftX(Integer.valueOf(leftNum1) / Integer.valueOf(result), leftNum2);
                    break;
            }

        }

        if (result.contains("x")) {
            switch (operator) {
                case "+":
                    valOfX = findLeftX(Integer.valueOf(leftNum1) + Integer.valueOf(leftNum2), result);
                    break;
                case "-":
                    valOfX = findLeftX(Integer.valueOf(leftNum1) - Integer.valueOf(leftNum2), result);
                    break;
                case "*":
                    valOfX = findLeftX(Integer.valueOf(leftNum1) * Integer.valueOf(leftNum2), result);
                    break;
                case "/":
                    valOfX = findLeftX(Integer.valueOf(leftNum1) / Integer.valueOf(leftNum2), result);
                    break;
            }

        }

        return valOfX;
    }

    private static String findLeftX(Integer rightNum, String xStr) {
        Integer x = new Integer(0);
        String rNumStr = String.valueOf(rightNum);
        if (String.valueOf(xStr.charAt(xStr.length() - 1)).equals("x")) {
            x = rightNum % 10;
        } else {
            int k = 0;
            while (k < xStr.length() - 1) {
                if (String.valueOf(xStr.charAt(k)).equals("x")) {
                    return String.valueOf(rNumStr.charAt(k));
                }
                k++;
            }
        }
        return String.valueOf(x);
    }

    public static void main(String[] args) {
        System.out.println(MissingDigit("4 - 2 = x"));
        System.out.println(MissingDigit("1x0 * 12 = 1200"));
    }

}
