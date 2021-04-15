package Codility.PrimeCompositeNumbers;

public class MinPerimeterRectangle {
//    Find the minimal perimeter (obwód) of any rectangle whose area equals N.

//    The goal is to find the minimal perimeter of any rectangle whose area equals N.
//    The sides of this rectangle should be only integers.

    public int solution(int N){
        int sqrt = (int) Math.sqrt(N);
        int perimiter = 0;

        for (int i = sqrt; i> 0; i--){
            if (N % i == 0){
                int A = i;
                int B = N/i;
                perimiter = (A*2) + (B*2);
                break;
            }
        }

        return perimiter;
    }

}
