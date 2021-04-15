package Coderbyte;

public class FirstFactorial {

    public static int firstFactorial(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(firstFactorial(3));
        System.out.println(firstFactorial(4));
        System.out.println(firstFactorial(8));
        System.out.println(firstFactorial(9));
        System.out.println(firstFactorial(10));
    }

}
