package Codility.SieveOfEratosthenes;

public class CountSemiprimes {

    public static int[] solution(int N, int[] P, int[] Q) {
        int length = P.length;
        int[] prime = sieve(N);
        boolean[] semiprime = semiprime(prime);
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int primeNumber = countSemiprime(P[i], Q[i], semiprime, N);
            result[i] = primeNumber;
        }

        return result;
    }


    // we are finding the smallest divider, which is a prime number
    public static int[] sieve(int N) {
        int[] prime = new int[N + 1];
        for (int i = 2; i <= (double) Math.sqrt(N); i++) {
            if (prime[i] == 0) {
                int k = i * i;
                while (k <= N) {
                    if (prime[k] == 0) {
                        prime[k] = i;
                    }
                    k += i;
                }
            }
        }
        return prime;
    }

    public static boolean[] semiprime(int[] prime) {
        boolean semiprime[] = new boolean[prime.length];
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == 0) continue;
            int firstFactor = prime[i];
            if (prime[i/firstFactor] == 0) semiprime[i] = true;
        }
        return semiprime;
    }

    public static int countSemiprime(int P, int Q, boolean[] semiprime, int N) {
        int count = 0;
        if (P > Q || P > N || Q > N) return 0;

        for (int i = P == 1 ? 2 : P; i <= Q; i++) {
            if (semiprime[i]) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int P[] = {1,4,16};
        int Q[] = {26,10,20};
        int[] solutionResult = solution(26, P, Q);

        for(int s : solutionResult){
            System.out.println(s);
        }

    }

}
