package Coderbyte.Medium;

public class EvenPairs {

    static String evenNumbers = "02468";
    static String numbers = "0123456789";

    public static String EvenPairs(String str) {

        int firstEvenIndex = -1;
        int secondEvenIndex = -1;

        //find index of first even number
        for (int i = 0; i < str.length(); i++) {
            if (evenNumbers.indexOf(str.charAt(i)) > -1) {
                if (firstEvenIndex == -1) {
                    firstEvenIndex = i;
                } else {
                    secondEvenIndex = i;
                }

                if (firstEvenIndex > -1 && secondEvenIndex > -1) {
                    boolean areAllNumbers = true;
                    for (int j = firstEvenIndex + 1; j < secondEvenIndex; j++) {
                        if (numbers.indexOf(str.charAt(j)) == -1){
                            areAllNumbers = false;
                            break;
                        }
                    }

                    if (areAllNumbers){
                        return "true";
                    } else {
                        firstEvenIndex = secondEvenIndex;
                        secondEvenIndex = -1;
                    }
                }
            }
        }

        return "false";
    }

    public static boolean hasAnyEven(String str){
        for(int i = 0; i < str.length(); i++){
            if(evenNumbers.indexOf(str.charAt(i)) > -1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(EvenPairs("3gy41d216"));
        System.out.println(EvenPairs("f09r27i8e67"));
    }

}
