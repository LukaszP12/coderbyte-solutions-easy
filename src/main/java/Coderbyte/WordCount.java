package Coderbyte;

public class WordCount {

    public static int WordCount(String str) {
        String[] s = str.split(" ");

        int lengthResult = s.length;

        return lengthResult;
    }


    public static void main(String[] args) {
        System.out.println(WordCount("Hello World"));
        System.out.println(WordCount("one 22 three"));
    }

}
