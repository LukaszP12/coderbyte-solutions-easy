package Coderbyte;

public class ArithGeo {

    private static boolean isArith(int[] arr) {
        int d1 = arr[1] - arr[0]; // the gap between every part of the sequence has to be the same
        for (int i = 2; i < arr.length; i++) {
            if (d1 != arr[i] - arr[i-1]){
                return false;
            }
        }

        return true;
    }

    private static boolean isGeo(int[] arr){
        int d1 = arr[1]/arr[0];
        for (int i=2; i<arr.length; i++){
            if (d1 != arr[i]/arr[i-1]){
                return false;
            }
        }

        return true;
    }

    private static String ArithGeo(int [] arr){

        if (isArith(arr)){
            return "Arithmetic";
        }

        if (isGeo(arr)){
            return "Geometric";
        }

        return "-1";
    }

    public static void main(String[] args) {

    }

}
