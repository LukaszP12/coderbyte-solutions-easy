package Coderbyte;

import java.util.*;

public class EquivalentKeypresses {

    final static String backspaceKey = "-B";

    public static String EquivalentKeypresses(String[] strArr) {

        String str1 = strArr[0];
        String str2 = strArr[1];

        String[] strings1 = splitStringCommas(str1);
        String[] strings2 = splitStringCommas(str2);


        String finalString1 = new StringBuilder(buildingUpString(strings1)).reverse().toString();
        String finalString2 = new StringBuilder(buildingUpString(strings2)).reverse().toString();

        System.out.println(finalString1);
        System.out.println(finalString2);

        // code goes here
        return (finalString1.equals(finalString2) == true) ? "true" : "false";
    }


    public static String[] splitStringCommas(String s){
        String[] split = s.split(",");
        return split;
    }

    public static String buildingUpString(String[] s) {

        Stack stack = new Stack();
        StringBuilder stringBuilder = new StringBuilder();

        for (String input : s){
            if (input.equals(backspaceKey)){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(input);
            }
        }

        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }

        String result = stringBuilder.toString();

        return result;
    }


    public static void main(String[] args) {

        String[] strings = {"a,b,c,d", "a,b,c,d,-B,d"};
        System.out.println(EquivalentKeypresses(strings));

        String[] strings1 = {"c,a,r,d", "c,a,-B,r,d"};
        System.out.println(EquivalentKeypresses(strings1));

    }

}
