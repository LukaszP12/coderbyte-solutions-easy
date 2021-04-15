package Coderbyte;

public class HDistance {

    public static int HDistance(String[] strArr) {
        String string1 = strArr[0];
        String string2 = strArr[1];

        int counter = 0;

        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)){
                counter++;
            }
        }

        return counter;
    }


    public static void main(String[] args) {
        String[] strings = {"10011", "10100"};
        System.out.println(HDistance(strings));

        String[] strings1 = {"abcdef", "defabc"};
        System.out.println(HDistance(strings1));

    }

}
