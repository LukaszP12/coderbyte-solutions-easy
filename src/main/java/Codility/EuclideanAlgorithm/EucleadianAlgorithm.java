package Codility.EuclideanAlgorithm;

public class EucleadianAlgorithm {

    // finding the greatest common dividor
    public static int eucleadianAlgo(int a, int b) {
        if (a == b) return a;

        if (a > b) {
            return eucleadianAlgo(a - b, b);
        } else {
            return eucleadianAlgo(a, b - a);
        }

    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    public static void print(int a, int b) {
        System.out.println("Greatest common dividor of: " + a + " and " + b);
    }

    public static void main(String[] args) {
        print(24, 9);
        System.out.println(eucleadianAlgo(24, 9));
        System.out.println(eucleadianAlgo(50, 10));

        System.out.println(gcd(48,9));
        System.out.println(48 % 9);
    }

}