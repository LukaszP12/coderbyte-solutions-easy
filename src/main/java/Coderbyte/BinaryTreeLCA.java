package Coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeLCA {

    public static String BinaryTreeLCA(String[] strArr, List<String> visited) {
        String[] tree = strArr[0].replace("[", "").replace("]", "").split(", ");

        visited.add(strArr[1]);
        visited.add(strArr[2]);

        int index1 = Arrays.asList(tree).indexOf(strArr[1]);
        int index2 = Arrays.asList(tree).indexOf(strArr[2]);

        String parent1 = tree[(int) Math.floor((index1 - 1) / 2)];
        String parent2 = tree[(int) Math.floor((index2 - 1) / 2)];

        if (visited.contains(parent1) || visited.contains(parent2)) return parent1;
        if (visited.contains(parent2)) return parent2;
        String[] newArr = {strArr[0], parent1, parent2};
        return BinaryTreeLCA(newArr, visited);
    }

    public static void main(String[] args) {
        String[] strings = {"[5, 2, 6, 1, #, 8, #]", "2", "6"};
        System.out.println(BinaryTreeLCA(strings, new ArrayList<String>()));

        String[] strings1 = {"[5, 2, 6, 1, #, 8, 12, #, #, #, #, #, #, 3, #]", "3", "12"};
        System.out.println(BinaryTreeLCA(strings1, new ArrayList<String>()));
    }
}
