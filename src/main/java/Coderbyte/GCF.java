package Coderbyte;

public class GCF {

    public static int GCF(int[] arr) {

        int x = arr[0];
        int y = arr[1];

        int gcd = 1;

        for (int i = 1; i <= x && i <= y; i++) {
            if (x%i == 0 && y%i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }


    public static void main(String[] args) {
        int[] ints = {1, 6};
        System.out.println(GCF(ints));

        int[] ints1 = {12, 28};
        System.out.println(GCF(ints1));
    }

}
