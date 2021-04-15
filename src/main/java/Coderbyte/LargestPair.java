package Coderbyte;

public class LargestPair {

    public static int LargestPair(int num) {
        int doubleDigit = 0;

        String numAsString = String.valueOf(num);

        if (numAsString.length() == 1){
            return num;
        }

        int maxDouble = Integer.MIN_VALUE;

        for (int i = 1; i < numAsString.length(); i++) {
            char c = numAsString.charAt(i - 1);
            char c1 = numAsString.charAt(i);

            String tempDoubleString = c + "" + c1;
            int tempDouble = Integer.parseInt(tempDoubleString);

            if(tempDouble>maxDouble){
                maxDouble=tempDouble;
            }
        }

        return maxDouble;
    }


    public static void main(String[] args) {
        System.out.println(LargestPair(453857));
        System.out.println(LargestPair(363223311));
        System.out.println(LargestPair(4759472));
    }

}
