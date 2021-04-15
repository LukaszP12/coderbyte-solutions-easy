package Codility.GreedyAlgorithms;

public class TieRopes {

//    An integer M and a non-empty array A consisting of N non-negative integers are given.
//    All integers in array A are less than or equal to M.

    public static int solution(int K, int[] A){

        // notice that only "adjacent ropes" can be tied
        // so, the problem is simple; we can use "greedy" method

        int total = 0;
        int currentLength = 0;

        for(int i=0; i<A.length; i++){
            currentLength = currentLength + A[i];
            if (currentLength >= K){
                total++;
                currentLength=0;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int A[] = {3,4,5,5,2};

    }

}
