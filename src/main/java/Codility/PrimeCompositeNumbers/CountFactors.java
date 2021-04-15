package Codility.PrimeCompositeNumbers;

//Count factors of given number n.

//A positive integer D is a factor of a positive integer N
//        if there exists an integer M such that N = D * M.


public class CountFactors {

    // for 24
    // 24 - 1
    // 12 - 2
    // 8 -  3
    // 6 -  4
    // numFactor = numFactor * 2; in order to add its pair

    public int solution(int N){
        int sqrtN = (int) Math.sqrt(N); // how many powers of particular number fit inside
        int numFactor = 0; // number of factors

        // check if i is a factor or not (by using N % i == 0)
        for (int i=1; i<=sqrtN; i++){
            if (N % i == 0){
                numFactor++;
            }
        }

        numFactor = numFactor * 2; // add its pair

        if (sqrtN * sqrtN == N){
            numFactor = numFactor - 1;
        }

        return numFactor;
    }

}
