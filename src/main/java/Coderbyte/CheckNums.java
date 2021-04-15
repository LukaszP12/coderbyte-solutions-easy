package Coderbyte;

public class CheckNums {

    public static String CheckNums(int num1, int num2) {
        // code goes here
        String retValue;

        if (num2 > num1){
            retValue = "true";
        } else if (num2 < num1){
            retValue = "false";
        } else {
            retValue = "-1";
        }

        return retValue;
    }


    public static void main(String[] args) {

    }

}
