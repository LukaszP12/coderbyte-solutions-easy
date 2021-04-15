package Codility.GreedyAlgorithms;

public class TieRopes2 {

    public static int solution(int K, int[] A){

        int total = 0;
        int currentLength = 0;

        for (int a : A){
            currentLength += a;
            if (currentLength >= K){
                total++;
                currentLength = 0;
            }

        }

        return total;
    }

    public static void main(String[] args) {
        int A[] = {1,2,3,4,1,1,3};
        System.out.println(solution(4,A));
    }

}
