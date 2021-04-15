package Coderbyte;

public class DashInsert {

    public static String DashInsert(String str) {
        String[] split = str.split("");

        String result = "";

        boolean previousOdd = false;

        for (String s : split) {

            if (Integer.parseInt(s) % 2 != 0 && Integer.parseInt(s) != 0 && previousOdd) {
                result += "-" + s;
                previousOdd = true;
            } else if (Integer.parseInt(s) % 2 != 0 && Integer.parseInt(s) != 0) {
                result += s;
                previousOdd = true;
            } else {
                result += s;
                previousOdd = false;
            }

        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(DashInsert("99946"));
        System.out.println(DashInsert("56730"));
    }

}
