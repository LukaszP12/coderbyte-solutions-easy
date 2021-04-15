package Coderbyte;

public class MultiplicativePersistenceRecurence {

    public static int counter = 0;

    public static int MultiplicativePersistenceRecurence(int num) {

        if (String.valueOf(num).length() == 1) {
            return counter;
        }

        if (num >= 10) {
            String s = String.valueOf(num);
            char[] chars = s.toCharArray();

            int multiply = 1;
            for (char c : chars) {
                multiply *= Integer.parseInt(String.valueOf(c));
            }

            num = multiply;
            counter++;
            return MultiplicativePersistenceRecurence(num);
        }

        return -1;
    }


    public static void main(String[] args) {
        System.out.println(MultiplicativePersistenceRecurence(4));
        System.out.println(MultiplicativePersistenceRecurence(25));
    }

}
