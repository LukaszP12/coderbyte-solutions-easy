package Coderbyte.Medium;

public class NearestSmallerValues {

    public static String NearestSmallerValues(int[] arr) {
        int[] result = new int[arr.length];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i-1; j >= 0; j--) {
                int min = -1;
                if (i != j && arr[j] <= arr[i]) {
                    min = arr[j];
                }
                result[i] = min;
            }
        }
        for (int a : result){
            builder.append(a);
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        int[] ints = {5, 3, 1, 9, 7, 3, 4, 1};
        String s = NearestSmallerValues(ints);
        System.out.println(s);

        int[] ints1 = {2, 4, 5, 1, 7};
        String s1 = NearestSmallerValues(ints1);
        System.out.println(s1);
    }
}
