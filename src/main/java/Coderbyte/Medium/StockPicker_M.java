package Coderbyte.Medium;

public class StockPicker_M {

    public static int StockPicker_M(int[] arr) {

        int max_profit = -1;
        int currentMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max_profit = Math.max(max_profit, arr[i] - currentMin);

            if (arr[i] < currentMin) {
                currentMin = Math.min(currentMin, arr[i]);
            }

        }

        return max_profit;
    }

    public static void main(String[] args) {
        int[] ints = {10, 12, 4, 5, 9};
        System.out.println(StockPicker_M(ints));

        int[] ints1 = {14, 20, 4, 12, 5, 11};
        System.out.println(StockPicker_M(ints1));
    }

}