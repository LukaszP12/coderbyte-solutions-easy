package Coderbyte;

public class ElementMerger {

    public static int ElementMerger(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int[] mergedElements = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
             mergedElements[i] = Math.abs(arr[i + 1] - arr[i]);
        }

        return ElementMerger(mergedElements);
    }

    public static int ElementMerger2(int[] arr) {
        return 0;
    }

    public static void main(String[] args) {
        int[] ints = {5, 7, 16, 1, 2};
        System.out.println(ElementMerger(ints));
    }

}
