package Coderbyte.Medium;

import java.util.ArrayList;
import java.util.List;

public class PairSearching2 {
    static int minCnt = Integer.MAX_VALUE;

    public static int PairSearching(int num) {
        getPair(num, new ArrayList<>(), 0);
        return minCnt;
    }

    private static void getPair(int num, List<Integer> digitList, int count) {
        if (count >= minCnt) {
            return;
        }
        int[] digits = toDigits(num);
        List<Integer> newList = addList(digitList, digits);
        if (findPair(newList)) {
            minCnt = count;
        } else {
            for (int i : digits) {
                if (i != 1) {
                    getPair(num * i, newList, count + 1);
                }
            }
        }

    }

    private static boolean findPair(List<Integer> myList) {
        int prev = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            int curr = myList.get(i);
            if (curr == prev) {
                return true;
            } else {
                prev = curr;
            }
        }
        return false;
    }

    private static List<Integer> addList(List<Integer> original, int[] digits) {
        List<Integer> newList = new ArrayList<>(original);
        for (int d : digits) {
            newList.add(d);
        }
        return newList;
    }

    private static int[] toDigits(int num) {
        char[] temp = Integer.toString(num).toCharArray();
        int[] ret = new int[temp.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = temp[i] - '0';
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(PairSearching(8));
        System.out.println(PairSearching(198));
    }
}
