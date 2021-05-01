package Coderbyte.Medium;

import java.util.Arrays;

public class SymmetricTree {

    public static boolean SymmetricTree(String[] strArr) {
        //take the array of strings stored in strArr,
        // which will represent a binary tree
        // and determine if the tree is symmetric (a mirror image of itself).

        // The first level of the tree is irrelevant, so start with the second level of the tree
        String[] tree = Arrays.copyOfRange(strArr, 1, strArr.length);
        int pow = 1;
        while (tree.length > 0) {
            // Each level of the binary tree has a power of two elements in it (i.e 1, 2, 4, 8, etc.)
            int num = (int) Math.pow(2, pow++);
            // Strip the number of nodes for the current level off the front of the remaining tree
            String[] level = Arrays.copyOfRange(tree, 0, num);
            // Check that the first half of the nodes on that level are the mirror image of the second half
            for (int i = 0; i < num / 2; i++) {
                // if the nodes in the first half are not mirror images of the second half, just return false
                if (!level[i].equals(level[num - 1 - i])) {
                    return false;
                }
            }
            tree = Arrays.copyOfRange(tree, num, tree.length);
        }
        return true;
    }


    public static void main(String[] args) {
        String[] strings = {"4", "3", "4"};
        String[] strings1 = {"10", "2", "2", "#", "1", "1", "#"};

        System.out.println(SymmetricTree(strings));
        System.out.println(SymmetricTree(strings1));
    }
}
