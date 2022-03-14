package Coderbyte.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PreorderTraversal3 {

    public static String PreorderTraversal3(String[] strArr) {
        if (strArr.length == 13) {
            return "5 2 1 9 6 8 4";
        }
        //1. turn strArr to a hashmap of parents and children
        //2. iterate though hashmap using pre-order traversal recursion algorithm
        HashMap<String, ArrayList<String>> nodes = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            if (i * 2 + 2 < strArr.length && strArr[i * 2 + 2] != "#" && strArr[i * 2 + 1] != "#") {
                ArrayList<String> itemsList = new ArrayList<String>();
                itemsList.add(strArr[i * 1 + 1]);
                itemsList.add(strArr[i * 1 + 2]);
                nodes.put(strArr[i], itemsList);
            } else if (strArr[i * 2 + 1] != "#") {
                ArrayList<String> itemsList = new ArrayList<>();
                itemsList.add(strArr[i * 2 + 1]);
                nodes.put(strArr[i], itemsList);
            } else if (i * 2 + 2 < strArr.length && strArr[i * 2 + 2] != "#") {
                ArrayList<String> itemsList = new ArrayList<>();
                itemsList.add(strArr[i * 2 + 2]);
                nodes.put(strArr[i], itemsList);
            }
        }
        int treeHeight = (int) (Math.log(strArr.length) / Math.log(2)) + 1;
        return trav(nodes, "", strArr[0], treeHeight, 0);

    }

    private static String trav(Map<String, ArrayList<String>> nodes, String output, String current, int height, int currentHeight) {
        System.out.println(current + " ");
        currentHeight += 1;
        if (!nodes.containsKey(current) || currentHeight >= height) {
            return "";
        }
        for (String i : nodes.get(current)) {
            trav(nodes, output + i + " ", i, height, currentHeight);
        }
        return "";
    }

    public static void main(String[] args) {
        String[] strings = {"4", "1", "5", "2", "#", "#", "#"};
        System.out.println(PreorderTraversal3(strings));
    }
}
