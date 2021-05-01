package Coderbyte.Medium;

public class BinaryConverter {

    public static int BinaryConverter(String str) {

        int length = str.length();

        if (length == 0){
            return 0;
        }

        int factorial = 1;
        int sum = 0;

        for (int i = length - 1; i >= 0; i--) {
            int numericValue = Character.getNumericValue(str.charAt(i));
            if (numericValue == 1){
                sum += factorial;
            }

            factorial*=2;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(BinaryConverter("100101"));
        System.out.println(BinaryConverter("011"));
    }

}
