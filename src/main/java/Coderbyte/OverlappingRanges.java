package Coderbyte;

public class OverlappingRanges {

    public static String OverlappingRanges(int[] arr) {
        int beg1 = arr[0];
        int end1 = arr[1];
        int beg2 = arr[2];
        int end2 = arr[3];

        int predicted = arr[4];

        int ourPrediction = 0;

        if ((beg1 == beg2) && (end1 == end2)) {
            ourPrediction = end1 - beg1;
            ourPrediction++;

            if (ourPrediction >= predicted){
                return ("true");
            }else {
                return ("false");
            }
        }

        if ((beg1 == beg2) && (end1 < end2)){

        }

        return "";
    }


    public static void main(String[] args) {
        int[] ints = {5, 11, 1, 5, 1};
    }

}
