package Coderbyte;

public class OneDecremented {

    public static int OneDecremented(String str) {

        char previousChar = str.charAt(0);

        int counter = 0;

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if(previousChar - currentChar == 1){
                counter++;
            }

            previousChar = currentChar;

        }

        return counter;
    }


    public static void main(String[] args) {
        System.out.println(OneDecremented("56"));
        System.out.println(OneDecremented("9876541110"));
    }

}
