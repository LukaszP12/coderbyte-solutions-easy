package Coderbyte.Medium;

public class Primes {

    public static Boolean Primes(int num) {

        if (num == 1 || num == 2 || num == 3) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        } else if (num % 3 == 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Primes(4));
        System.out.println(Primes(1709));
    }

}
