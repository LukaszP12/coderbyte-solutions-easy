package Coderbyte.Medium;

import java.util.HashMap;
import java.util.Map;

public class StringExpression {

    public static String StringExpression(String str) {


        return str;
    }


    public static void main(String[] args) {
        String str = "onezeropluseight";

        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("zero",0);
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("four",4);
        numbers.put("five",5);
        numbers.put("six",6);
        numbers.put("seven",7);
        numbers.put("eight",8);
        numbers.put("nine",9);
        numbers.put("ten",10);

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder numberText = new StringBuilder();
        String s;
        int number = 0,lastNumber;
        Character operation = null;
        for (int i=0;i<str.length();i++){
            stringBuilder.append(str.charAt(i));
            if (stringBuilder.length() < 3)
            {
                continue;
            }
            s = stringBuilder.toString();
            if (numbers.containsKey(s))
            {
                numberText.append(numbers.get(s));
                stringBuilder.setLength(0);
            }
        }


        System.out.println(numbers.entrySet());
    }

}
