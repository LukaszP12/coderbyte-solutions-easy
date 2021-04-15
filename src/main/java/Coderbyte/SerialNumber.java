package Coderbyte;

public class SerialNumber {

    public static String SerialNumber(String str) {
        String[] split = str.split("\\.");

        // 1. condition It needs to contain three sets each
        // with three digits (1 through 9) separated by a period.
        for (String s : split){
            if (s.length() != 3){
                return "false";
            }
        }

        // 2. The first set of digits must add up to an even number.
        int sum = 0;
        for (int i=0;i<split[0].length();i++){
            sum += split[0].charAt(i);
        }

        if (sum%2 != 0){return "false";}

        //3. The second set of digits must add up to an odd number.
        int sum1 = 0;
        for (int i=0;i<split[1].length();i++){
            sum1 += split[1].charAt(i);
        }

        if (sum1%2 == 0){return "false";}

        //4. The last digit in each set must be larger than the two previous digits in the same set.
        for (String s : split){
            if (s.charAt(0) + s.charAt(1) > s.charAt(1) + s.charAt(2)){
                return "false";
            }
        }


        return "true";
    }


    public static void main(String[] args) {
        String[] split = "114.568.112".split("\\.");
        System.out.println(SerialNumber("11.124.667"));
        System.out.println(SerialNumber("114.568.112"));

        String[] split1 = "ala.ma.kota".split(".");
        for (String s : split1){
            System.out.println(s);
        }

    }

}
