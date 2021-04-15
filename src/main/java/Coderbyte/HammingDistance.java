package Coderbyte;

public class HammingDistance {

    public static int HammingDistance(String[] strArr) {

        int counter = 0; // where the positions are different

        String string1 = strArr[0];
        String string2 = strArr[1];

        if (string1.length() == 0 || string2.length() == 0){
            return 0;
        }

        for (int i=0; i<string1.length(); i++){

            if (string1.charAt(i) != string2.charAt(i)){
                counter++;
            }

        }

        return counter;
    }


    public static void main(String[] args) {
        String[] strings = {"10011", "10100"};
        String[] strings1 = {"helloworld", "worldhello"};
        String[] strings2 = {"", ""};

        System.out.println(HammingDistance(strings));
        System.out.println(HammingDistance(strings1));
        System.out.println(HammingDistance(strings2));
    }

}
