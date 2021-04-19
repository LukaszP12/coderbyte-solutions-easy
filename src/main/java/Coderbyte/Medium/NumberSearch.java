package Coderbyte.Medium;

public class NumberSearch {

    public static int NumberSearch(String str) {
        String replacedDigitsOnly = str.replaceAll("[^0-9]", "");
        String onlyLetters = str.replaceAll("[^A-Za-z]", "");

        double sum = 0;
        for (int i=0;i<replacedDigitsOnly.length();i++){
            char c = replacedDigitsOnly.charAt(i);
            if (Character.isDigit(c)){
                sum += Character.getNumericValue(c);
            }
        }

        double onlyLettersLength = onlyLetters.length();

        try {
            return (int) Math.round(sum / onlyLettersLength);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(NumberSearch("H3ello9-9"));
        System.out.println(NumberSearch("One Number*1*"));
//        System.out.println(NumberSearch("123"));

        // incorrect cases
        System.out.println(NumberSearch("i love cake 9 8 7"));
        System.out.println(NumberSearch("3ko6"));
        System.out.println(NumberSearch("1p2ol5e ** 6"));

//        "3ko6"
//        "1p2ol5e ** 6"

        }

}
