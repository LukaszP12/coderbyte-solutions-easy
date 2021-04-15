package Coderbyte;

public class FizzBuzz {

    public static String FizzBuzz(int num) {

        if (num == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0) {
                result.append("Fizz" + " ");
            } else if (i % 5 == 0) {
                result.append("Buzz" + " ");
            } else if ((i % 3 == 0) && (i % 5 == 0)) {
                result.append("FizzBuzz" + " ");
            } else {
                result.append(i + " ");
            }

        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzz(3));
        System.out.println(FizzBuzz(8));
        System.out.println(FizzBuzz(16).equals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16"));

        System.out.println(FizzBuzz(21));
    }

}
