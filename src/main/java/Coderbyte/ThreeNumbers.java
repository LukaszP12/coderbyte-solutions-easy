package Coderbyte;

public class ThreeNumbers {

//    Have the function ThreeNumbers(str) take the str parameter being passed
//    and determine if exactly three unique, single-digit integers occur within each word in the string.

//    Have the function ThreeNumbers(str) take the str parameter being passed and determine
//    if exactly three unique, single-digit integers occur within each word in the string.

    public static String ThreeNumbers(String str) {
        String[] split = str.split(" ");

        for (String s : split) {

            int counter = 0;
            char[] currentWord = s.toCharArray();

            for (int i = 0; i < currentWord.length - 1; i++) {

                if ((i < currentWord.length - 3) && Character.isDigit(currentWord[i]) && Character.isDigit(currentWord[i+1]) && Character.isDigit(currentWord[i+2])){
                    return "false";
                }

                if (Character.isDigit(currentWord[i])) {
                    if (!(s.substring(0, i).contains("" + currentWord[i]))) {
                        counter++;
                    }
                }
            }
            if ((Character.isDigit(currentWord[currentWord.length-1])) && !(s.substring(0, s.length() - 1).contains("" + currentWord[currentWord.length - 1]))) {
                counter++;
            }

            if (counter != 3)return "false";

        }

        return "true";
    }


    public static void main(String[] args) {
        System.out.println(ThreeNumbers("2a3b5 w1o2rl3d g1gg92"));
        System.out.println(ThreeNumbers("21aa3a ggg4g4g6ggg"));
    }

}
