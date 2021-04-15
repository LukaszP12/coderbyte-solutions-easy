package Coderbyte;

import java.util.Scanner;

public class LetterCountI {

    public static String LetterCountI(String str) {
        String[] wordArray = str.split("\\s");

        int numRepitition = 0;
        String whichWord = "";
        for (String word : wordArray) {
            word.replaceAll("[^A-Za-z]", "");
            int MaxltrCount = 0;
            for (int i = 0; i < word.length(); i++) {
                int ltrCount = 1;
                for (int j = i + 1; j < word.length(); j++) {
                    if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(word.charAt(j))) {
                        ltrCount++;
                    }
                }
                if (ltrCount > MaxltrCount){MaxltrCount = ltrCount;}
            }
            if(MaxltrCount > numRepitition){
                numRepitition = MaxltrCount;
                whichWord = word;
            }
        }

        return numRepitition > 1 ? whichWord : "-1";
    }

    public static void main(String[] args) {

    }


}
