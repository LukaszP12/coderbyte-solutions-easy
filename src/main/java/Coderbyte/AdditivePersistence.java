package Coderbyte;

public class AdditivePersistence {

    public static int counter = 0;

    public static int AdditivePersistence(int num) {

        if (String.valueOf(num).length() == 1) {
            return counter;
        }

        if (num >= 10) {
            String s = String.valueOf(num);
            char[] chars = s.toCharArray();

            int addition = 0;
            for (char c : chars) {
                addition += Integer.parseInt(String.valueOf(c));
            }

            num = addition;
            counter++;
            return AdditivePersistence(num);
        }

        return -1;

    }


    public static void main(String[] args) {
        System.out.println(AdditivePersistence(4));
        System.out.println(AdditivePersistence(19));
    }

}
