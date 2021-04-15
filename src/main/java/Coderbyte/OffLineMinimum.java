package Coderbyte;


import java.util.*;

public class OffLineMinimum {

    public static String OffLineMinimum(String[] strArr) {

        StringBuilder results = new StringBuilder();

        boolean previousE = false;
        boolean firstE = false;

        int currentMin = Integer.MAX_VALUE;

        Set<Integer> numbersSet = new HashSet<Integer>();

        for (int i = 0; i < strArr.length; i++) {

            if (strArr[i] != "E") {
                int currentNumber = Integer.parseInt(strArr[i]);
                if (currentNumber < currentMin) {
                    currentMin = currentNumber;
                } else {
                    // put numbers in the set
                    numbersSet.add(currentNumber);
                }

            }

            if (strArr[i] == "E" && !firstE) {
                results.append(currentMin);
                previousE = true;
                firstE = true;
                currentMin = Integer.MAX_VALUE;
            }

            if (strArr[i] == "E" && firstE) {

                if (!numbersSet.isEmpty()) {
                    int lowestFromSet = findLowestFromSet(numbersSet);
                    currentMin = lowestFromSet;
                    results.append("," + currentMin);
                    previousE = true;
                } else {
                    currentMin = Integer.MAX_VALUE;
                }
            }

        }


        String resultsString = results.toString();
        return resultsString;
    }

    private static int findLowestFromSet(Set<Integer> numberSet) {
        int min = Integer.MAX_VALUE;

        Comparator<Integer> minComparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer n1, Integer n2) {
                return n1.compareTo(n2);
            }
        };

        Optional<Integer> min1 = numberSet.stream().min(minComparator);

        return min1.get();
    }

    public static void main(String[] args) {

        String[] strings = {"1", "2", "E", "E", "3"};
        System.out.println(OffLineMinimum(strings));

        String[] strings1 = {"4", "E", "1", "E", "2", "E", "3", "E"};
        System.out.println(OffLineMinimum(strings1));

        // incorrect cases
        String[] strings2 = {"5", "4", "6", "E", "1", "7", "E", "E", "3", "2"};
        System.out.println(OffLineMinimum(strings2));

    }

}
