package Codility.PrefixSums;

public class CountDiv1 {

    public static int solution(int A, int B, int K){
        int b = B / K; // total number of divisible numbers of range [0,B]
        int a = A > 0 ? (A - 1) / K : 0; // total number of divisible numbers of range [0,A], excluding A

        if(A == 0){
            b++;
        }

        return b-a;
    }

    public static void main(String[] args) {
        System.out.println(solution(6,11,2));
    }

}
