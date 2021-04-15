package Codility.EuclideanAlgorithm;

public class ChocolatesByNumbers {

//Two positive integers N and M are given.
//Integer N represents the number of chocolates arranged in a circle, numbered from 0 to N − 1.

    public static int solution(int N, int M) {
        return N / (gcd(N, M));
    }

//  i * M + k * N = j * M (i*4 + k*10 = j*4) = (0*4 + 2*10 = 5*4)
//  M are chocolates ommited
//  j are number of chocolates that we will eat

    public static int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 4));
    }

}
