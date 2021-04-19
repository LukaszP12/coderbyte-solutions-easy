package Coderbyte.Medium;

public class Division {


    public static int Division(int num1, int num2) {

        int num = num1 > num2 ? num1 : num2;
        int result = 0;

        for (int i = 1; i <= num; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Division(7,3));
        System.out.println(Division(36,54));
    }

}
