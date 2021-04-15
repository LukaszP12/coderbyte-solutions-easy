package Coderbyte;

public class Superincreasing {

    public static boolean Superincreasing(int[] arr) {


        if (arr.length < 2) {
            return false;
        }

        if (arr.length == 2) {
            if (arr[0] < arr[1]) {
                return true;
            } else {
                return false;
            }
        }

        int i = 2;

        if (arr.length > 2) {
            while (i < arr.length) {
                if (arr[i - 2] + arr[i - 1] < arr[i]) {
                    i++;
                } else {
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4};
        System.out.println(Superincreasing(ints));

        int[] ints1 = {1, 2, 5, 10};
        System.out.println(Superincreasing(ints1));

        int[] ints2 = {3, 3};
        System.out.println(Superincreasing(ints2));

        int[] ints3 = {2, 3};
        System.out.println(Superincreasing(ints3));
    }

}
