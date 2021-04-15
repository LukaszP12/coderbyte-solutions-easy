package Codility.SieveOfEratosthenes;

import java.util.HashMap;

public class CountNonDivisable {

    private HashMap<Integer, Integer> map2;

    public static int[] solution(int A[]) {
        // array A consists of N integers
        // for each number A[i] such that 0 ≤ i < N,
        // we want to count the number of elements of the array that are not the divisors of A[i].
        // We say that these elements are non-divisors.

        // first HashMap stores the appearance of each number
        HashMap<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (map1.containsKey(A[i]) == false) {
                map1.put(A[i], 1);
            } else {
                map1.put(A[i], map1.get(A[i]) + 1);
            }
        }

        System.out.println("This is the first map: " + map1.toString());

        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int n : map1.keySet()) {
            // we are looking for possible divisors of numbers
            int numDivisors = 0;
            int sqrtN = (int) Math.sqrt(n);

            for (int i = 1; i <= sqrtN; i++) {

                if (n % i == 0) {
                    int anotherDivisor = n / i;

                    if (map1.containsKey(i) == true) {
                        numDivisors = numDivisors + (map1.get(i));
                    }

                    if (anotherDivisor != i) {
                        if (map1.containsKey(anotherDivisor) == true) {
                            numDivisors = numDivisors + map1.getOrDefault(anotherDivisor, 0);
                        }
                    }

                }
            }

            int numNonDivisors = A.length - numDivisors;
            map2.put(n, numNonDivisors);
        }

        System.out.println("This is the second map");
        System.out.println(map2.toString());

        int[] results = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            results[i] = map2.get(A[i]);
        }

        return results;
    }

    public static void main(String[] args) {

        int A[] = {3, 1, 2, 3, 6};
        solution(A);

        int B[] = {2};
        solution(B);

    }

}
