package Coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeLCA2 {

    public static String BinaryTreeLCA2(String[] strArr) {
        String[] tree = strArr[0].substring(1, strArr[0].length() - 1).split(", ");
        List<String> nodeList = Arrays.asList(tree);

        String a = strArr[1];
        String b = strArr[2];

        int aIndex = nodeList.indexOf(a);
        int bIndex = nodeList.indexOf(b);

        ArrayList<String> alist = new ArrayList<>();
        ArrayList<String> blist = new ArrayList<>();

        while (aIndex > 0 || bIndex > 0) {
            while (aIndex > 0) {
                alist.add(nodeList.get(aIndex));
                aIndex = findParentIndex(aIndex);
            }

            while (bIndex > 0) {
                blist.add(nodeList.get(bIndex));
                bIndex = findParentIndex(bIndex);
            }

        }
        alist.add(nodeList.get(0));
        blist.add(nodeList.get(0));

        for (String item : alist) {
            if (blist.contains(item)) {
                return item;
            }
        }

        return "-1";
    }

    private static int findParentIndex(int index) {
        return (index - 1) / 2;
    }

    public static void main(String[] args) {
        String[] strings = {"[5, 2, 6, 1, #, 8, #]", "2", "6"};
        System.out.println(BinaryTreeLCA2(strings));

        String[] strings1 = {"[5, 2, 6, 1, #, 8, 12, #, #, #, #, #, #, 3, #]", "3", "12"};
        System.out.println(BinaryTreeLCA2(strings1));
    }
}
