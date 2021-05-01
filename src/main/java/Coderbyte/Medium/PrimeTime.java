package Coderbyte.Medium;

public class PrimeTime {

    public static String PrimeTime(int num) {

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return "false";
            }
        }

        return "true";
    }

    public static void main(String[] args) {
        System.out.println(PrimeTime(19));
        System.out.println(PrimeTime(100));
    }

}
