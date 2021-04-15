package Coderbyte;

public class NumberStream3 {

    public static Boolean NumberStream(String str) {
        int currentNum = 0;
        int counter = 0;
        char[] numbers = str.toCharArray();

        for (int i = 0; i < numbers.length; i++) {
            if (Character.getNumericValue(numbers[i]) != currentNum) {
                 currentNum = Character.getNumericValue(numbers[i]);
                 counter = 1;
            } else {
                currentNum = Character.getNumericValue(numbers[i]);
                counter++;
                if (counter == currentNum){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(NumberStream("6539923335"));
    }

}
