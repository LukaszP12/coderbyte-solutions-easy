package Codility.EuclideanAlgorithm;

public class CommonPrimeDivisors {

    public static int solution(int A[], int B[]) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (hasSamePrimeDivisors(A[i], B[i])) {
                count++;
            }
        }
        return count;
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }

    private static boolean hasSamePrimeDivisors(int a, int b) {
        int gcdValue = gcd(a, b); // the gcd contains all the common prime divisors
        int gcdA;
        int gcdB;
        while (a != 1) {
            gcdA = gcd(a, gcdValue);
            if (gcdA == 1) // does not contain any more common prime divisors
                break;
            a = a / gcdA;
        }
        if (a != 1) {
            // if x and y have exactly the same common
            // prime divisors, x must be composed by
            // the prime divisors in gcd
            return false;
        }
        while (b != 1) {
            gcdB = gcd(b, gcdValue);
            if (gcdB == 1)
                // b does not contain any more common prime divisors
                break;
            b = b / gcdB;
        }
        return b == 1;
    }

    public static void main(String[] args) {
        System.out.println(gcd(15, 75));

    }

}
