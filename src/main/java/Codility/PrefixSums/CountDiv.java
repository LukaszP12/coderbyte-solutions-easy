package Codility.PrefixSums;

//that, given three integers A, B and K,
//returns the number of integers within the range [A..B] that are divisible by K, i.e.:

public class CountDiv {

    public static int solution(int A, int B, int K){
        int count = 0;

        for (int i=A; i<=B;i++){
            if(i % K == 0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(6,11,2));
    }

}
