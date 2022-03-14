package Coderbyte.Medium;

import java.beans.Expression;

public class StringCalculate {

    public static double StringCalculate(String str) {
        String expression = str
                .replaceAll("[*]{2}", "^")
                .replaceAll("[)][(]", ")*(")
                .replaceAll("([0-9])\\(", "$1*(");

        return Expession.evaluate(expression);
    }

    static class Expession {
        int idx = -1;
        char ch;
        String expression;

        private Expession(String expression) {
            this.expression = expression;
        }

        private void next() {
            ch = (++idx < expression.length()) ? expression.charAt(idx) : 0;
        }

        private boolean findOperator(char operator) {
            if (ch == operator) {
                next();
                return true;
            }
            return false;
        }

        private int parse() {
            next();
            int x = handleAdditionSubtraction();
            if (idx < expression.length()) {
                throw new RuntimeException("Malformed expression at '" + ch + "'");
            }
            return x;
        }

        private int handleAdditionSubtraction() {
            int x = handleMultiplicationDivision();
            while (true) {
                if (findOperator('+')) {
                    x += handleMultiplicationDivision();
                } else if (findOperator('-')) {
                    x -= handleMultiplicationDivision();
                } else {
                    return x;
                }
            }
        }

        private int handleMultiplicationDivision() {
            int x = handleParenthesesExponentiation();
            while (true) {
                if (findOperator('*')) {
                    x *= handleParenthesesExponentiation();
                } else if (findOperator('/')) {
                    x /= handleParenthesesExponentiation();
                } else {
                    return x;
                }
            }
        }

        private int handleParenthesesExponentiation() {
            int x;
            int startPos = this.idx;
            if (findOperator('(')) {
                x = handleAdditionSubtraction();
                findOperator(')');
            } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                while ((ch >= '0' && ch <= '9') || ch == '.') {
                    next();
                }
                x = Integer.parseInt(expression.substring(startPos, this.idx));
            } else {
                throw new RuntimeException("Malformed expression at '" + ch + "'");
            }
            if (findOperator('^')) {
                x = (int) (Math.pow(x, handleParenthesesExponentiation()));
            }

            return x;
        }

        static int evaluate(String expression) {
            Expession e = new Expession(expression);
            return e.parse();
        }

    }

    public static void main(String[] args) {
        String s = "6*(4/2)+3*1";
        System.out.println(StringCalculate(s));

        String s1 = "100*2**4";
        System.out.println(StringCalculate(s1));
    }
}
