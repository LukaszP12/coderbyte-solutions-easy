package Coderbyte;

public class NumberStream {

    public static Boolean NumberStream(String str) {

        char[] chars = str.toCharArray();

        int currentNumber = 0;
        int counter = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (Character.getNumericValue(chars[i]) != currentNumber) {
                currentNumber = Character.getNumericValue(chars[i]);
                counter = 1;
            } else if (Character.getNumericValue(chars[i]) == currentNumber) {
                counter++;
                if (counter == currentNumber) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(NumberStream("5556293383563665"));
        System.out.println(NumberStream("5788888888882339999"));
        
    }


}