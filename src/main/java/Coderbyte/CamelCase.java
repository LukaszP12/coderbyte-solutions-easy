package Coderbyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CamelCase {

    public static String CamelCase(String str) {
        String[] words = str.replaceAll("[^a-zA-z0-9\\s]", " ").split(" ");
        StringBuilder camelCase = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            camelCase.append(camelConverter(words[i],i)); 
        }

        return camelCase.toString();
    }

    private static String camelConverter(String str, int i) {
        if (i==0){
            return str.substring(0,1).toLowerCase() + str.substring(1).toLowerCase();
        }else {
            return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        }
    }

    public static String CamelCase2(String str){
        List<String> words = new ArrayList<>();
        String word ="";
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (!Character.isAlphabetic(c)){
                if (word.length()>0){
                    words.add(word);
                }
                word="";
                continue;
            }
            word+=c;
        }
        //toDo review this solution
        return "";
    }

    public static void main(String[] args) {
        String result = CamelCase("cats AND*Dogs-are Awesome");
        System.out.println(result);

        String result1 = CamelCase("a b c d-e-f%g");
        System.out.println(result1);
    }


}
