package Coderbyte;

public class PowerSetCount {

    public static int PowerSetCount(int[] arr) {
        return (int) Math.pow(2,arr.length);
    }

    public static int PowerSetCount2(int[] arr){
        int arrLength = arr.length;

        int totalCombinations = 0;

        int total = 0;

        for(int i=1;i<arr.length;i++){
            total += combinationCalculator(i,arrLength);
        }

        total += 2;

        return (total);
    }

    public static int combinationCalculator(int num, int length) {
        int realTop = 1;

        int bottom1 = 1;

        int bottom2 = 1;

        for (int i = length; i >= 1; i--) {
            realTop *= i;
        }

        for (int i = num; i >= 1; i--) {
            bottom1 *= i;
        }

        for (int i = length - num; i >= 1; i--) {
            bottom2 *= i;
        }

        int result = realTop / (bottom1 * bottom2);

        return (result);
    }


    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4};
        System.out.println(PowerSetCount(ints));
        System.out.println(PowerSetCount2(ints));
    }

}
