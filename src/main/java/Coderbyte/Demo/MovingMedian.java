package Coderbyte.Demo;

import org.jetbrains.annotations.NotNull;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.TreeSet;

public class MovingMedian {

    public static String movingMean(int[] ints, int k) {
        String result = "";


        for (int i = 0; i < ints.length; i++) {

//            getMean(k, minSet, maxSet);
        }

        return result;
    }

    public static class Pair implements Comparable<Pair> {
        private int value;
        private int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(@NotNull Pair o) {
            if (this.index == o.index) {
                return 0;
            } else if (this.value == o.value) {
                return Integer.compare(this.index, o.index);
            } else {
                return Integer.compare(this.value, o.value);
            }
        }

        public int getValue() {
            return this.value;
        }

        public void renew(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    static void getMean(int arr[], int k) {
        TreeSet<Pair> minSet = new TreeSet<>();
        TreeSet<Pair> maxSet = new TreeSet<>();

        Pair[] pairs = new Pair[k];

        for (int i = 0; i < k; i++) {
            pairs[i] = new Pair(arr[i], i);
        }

        for (int i = 0; i < k / 2; i++) {
            maxSet.add(pairs[i]);
        }

        for (int i = k / 2; i < k; i++) {
            if (arr[i] < maxSet.first().getValue()) {
                minSet.add(pairs[i]);
            } else {
                minSet.add(maxSet.pollFirst());
                maxSet.add(pairs[i]);
            }
        }

        printMedian(minSet, maxSet, k);

        for (int i = k; i < arr.length; i++) {
            Pair temp = pairs[i % k];

            if (temp.getValue() <= minSet.last().getValue()) {

                minSet.remove(temp);

                temp.renew(arr[i], i);

                if (temp.getValue() < maxSet.first().getValue()) {
                    minSet.add(temp);
                } else {
                    minSet.add(maxSet.pollFirst());
                    maxSet.add(temp);
                }
            } else {
                maxSet.remove(temp);
                temp.renew(arr[i], i);

                if (temp.getValue() > minSet.last().getValue()) {
                    maxSet.add(temp);
                } else {
                    maxSet.add(minSet.pollLast());
                    minSet.add(temp);
                }
            }

            printMedian(minSet, maxSet, k);
        }

    }

    static void printMedian(TreeSet<Pair> minSet, TreeSet<Pair> maxSet, int window) {

        // even window size
        if (window % 2 == 0) {
            System.out.print((minSet.last().getValue() + maxSet.first().getValue()) / 2.0);
            System.out.println();
        } else /*else middle element*/ {
            System.out.print(minSet.size() > maxSet.size() ? minSet.last().getValue() : maxSet.first().getValue());
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[] ints = {-1, 5, 13, 8, 2, 3, 3, 1};
        int k = 3;

        getMean(ints, k);

    }

}
