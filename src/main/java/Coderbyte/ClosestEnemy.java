package Coderbyte;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ClosestEnemy {

    public static int ClosestEnemy(int[] arr) {

        int oneIndex = findOneIndex(arr);
        Set<Integer> set = allTwoIndexes(arr);

        if (set.isEmpty()){return 0;}

        int[] twoIndexes = set.stream().mapToInt(Number::intValue).toArray();

        int minDistance = Integer.MAX_VALUE;

        for (int index : twoIndexes){
            int distance = Math.abs(index - oneIndex);
            if( distance < minDistance){
                minDistance = distance;
            }
        }

        return minDistance;
    }

    private static Set<Integer> allTwoIndexes(int[] arr) {
        Set<Integer> twoIndexes = new HashSet<>();

        for (int i=0;i<arr.length;i++){
            if (arr[i] == 2){
                twoIndexes.add(i);
            }
        }
        return twoIndexes;
    }

    private static int findOneIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] ints1 = {0, 0, 1, 0, 2, 2, 2};
        System.out.println(ClosestEnemy(ints1));

        int[] ints2 = {1, 0, 0, 0, 2, 2, 2};
        System.out.println(ClosestEnemy(ints2));

        int[] ints3 = {2, 0, 0, 0, 2, 2, 1, 0};
        System.out.println(ClosestEnemy(ints3));

        // incorrect case
        int[] ints4 = {0, 1, 0};
        System.out.println(ClosestEnemy(ints4));

    }

}
