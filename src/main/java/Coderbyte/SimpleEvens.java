package Coderbyte;

import java.math.BigDecimal;

public class SimpleEvens {

    public static String SimpleEvens(int num) {

        String numString = String.valueOf(num);

        for (int i=0;i<numString.length();i++){
            int currentCharInt = Integer.parseInt(""+numString.charAt(i));
            if (currentCharInt %2 != 2){
                return "false";
            }
        }

        return "true";
    }

    public static void main(String[] args) {
//        System.out.println(SimpleEvens(2222220222));
//        System.out.println(SimpleEvens(20864646452));
//        System.out.println(SimpleEvens(222222222222228));
    }

}
