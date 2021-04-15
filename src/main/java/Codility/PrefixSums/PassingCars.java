package Codility.PrefixSums;

public class PassingCars {

    //toDo code has to work regardless of whenever we are beginning or ending with 0 or 1

    public static int solution(int[] A) {
        int countZero = 0;
        int pair = 0;
        int counter = 0;

        for (int i = A.length - 1; i >= 0; i--) {
            counter++;
            if (A[i] == 0) { // here a pair is counted, when a car passes to the east
                countZero++;
                pair += counter - countZero; // how many countOnes have already passed
                if (pair > 1000000000) {
                    return -1;
                }
            }
        }

        return pair;
    }

    public static int solution2(int[] A) {
        int countZero = 0;
        int pair = 0;

        for (int i = 0; i <= A.length - 1; i++) {
            if (A[i] == 0) {
                countZero++;
            } else if (A[i] == 1) { // here a pair is counted, when a car passes to the west
                pair += countZero;
                if (pair > 1000000000) {
                    return -1;
                }
            }
        }

        return pair;
    }

    public static void main(String[] args) {
        int tab[] = {0, 1, 0, 1, 1};
        System.out.println(solution(tab));
        System.out.println(solution2(tab));
    }

}
