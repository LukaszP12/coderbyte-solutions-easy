package Coderbyte.Easy;

import org.jetbrains.annotations.NotNull;
import pl.ListsDemo;

import java.util.TreeSet;

public class MedianOfSlidingWindow {

//    find the median of each window of size k
//    starting from the left and moving towards the right by one position each time.

//    two pairs are equal only when their indices are equal


    // Pair class for the value and its index
    static class Pair implements Comparable<Pair> {
        private int value, index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(@NotNull Pair o) {
            // two nodes are equal only when
            // their indices are same
            if (index == o.index) {
                return 0;
            } else if (value == o.value) {
                return Integer.compare(index, o.index);
            } else {
                return Integer.compare(value, o.value);
            }
        }

        public int value() {
            return value;
        }

        public void renew(int v, int p) {
            value = v;
            index = p;
        }

        @Override
        public String toString() {
            return String.format("(%d,%d)", value, index);
        }
    }

    // function to print the median for the current window
    static void printMedian(TreeSet<Pair> minSet, TreeSet<Pair> maxSet, int window) {

        if (window % 2 == 0) {
            System.out.print((minSet.last().value + maxSet.first().value) / 2.0);
            System.out.println();
        } else {
            System.out.print(minSet.size() > maxSet.size() ? minSet.last().value() :
                    maxSet.first().value());
            System.out.println();
        }
    }

    // function to find the median of every window of size k
    static void findMedian(int arr[], int k) {
        TreeSet<Pair> minSet = new TreeSet<>();
        TreeSet<Pair> maxSet = new TreeSet<>();

        // To hold the pairs, we will keep renewing
        // these instead of creating the new pairs
        Pair[] windowPairs = new Pair[k];

        for (int i = 0; i < k; i++) {
            windowPairs[i] = new Pair(arr[i], i);
        }

        for (int i = 0; i < k / 2; i++) {
            maxSet.add(windowPairs[i]);
        }

        for (int i = k / 2; i < k; i++) {

            if (arr[i] < maxSet.first().value()) {
                minSet.add(windowPairs[i]);
            } else {
                minSet.add(maxSet.pollFirst());
                maxSet.add(windowPairs[i]);
            }
        }

        printMedian(minSet, maxSet, k);

        for (int i = k; i < arr.length; i++) {

            // get the pair at the start of the window,
            // this will reset to 0 at every k, 2k, 3k, ...
            Pair temp = windowPairs[i % k];
            if (temp.value <= minSet.last().value()) {

                // remove the starting pair of the window
                minSet.remove(temp);

                // renew window start to new window end
                temp.renew(arr[i], i);

                if (temp.value() < maxSet.first().value()) {
                    minSet.add(temp);
                } else {
                    minSet.add(maxSet.pollFirst());
                    maxSet.add(temp);
                }

            } else {
                maxSet.remove(temp);
                temp.renew(arr[i], i);

                if (temp.value() > minSet.last().value()) {
                    maxSet.add(temp);
                } else {
                    maxSet.add(minSet.pollLast());
                    minSet.add(temp);
                }
            }

            printMedian(minSet, maxSet, k);
        }
    }

    public static void main(String[] args) {
        int[] ints = {-1, 5, 13, 8, 2, 3, 3, 1};
        int k = 3;
        findMedian(ints, k);

        int[] ints1 = {-1, 5, 13, 8, 2, 3, 3, 1};
        int k1 = 4;

    }

}
