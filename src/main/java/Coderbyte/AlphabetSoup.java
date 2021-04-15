package Coderbyte;

import java.util.Arrays;

public class AlphabetSoup {

    public static String AlphabetSoup(String str){

        String[] split = str.split("");
        Arrays.sort(split);

        StringBuilder sb = new StringBuilder();

        for (String s : split){
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(AlphabetSoup("coderbyte"));
    }

}
