package Coderbyte;

//The string \s is a regular expression that means "whitespace",
//and you have to write it with two backslash characters ( "\\s" ) when writing it as a string in Java.

public class LongestWord2 {


    String longestWord(String str){
        String[] words = str.split("\\s");
        String longestWord = null;
        int longestWordLength = 0;

        for (String word : words){
            int wordLength = word.length();
            if (longestWord == null || wordLength > longestWordLength){
                longestWord = word;
                longestWordLength = wordLength;
            }
        }

        return longestWord;
    }



}
