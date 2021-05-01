package Coderbyte.Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TreeConstructor {

    // There is one root node
    // Every child has one parent
    // each parent has at most two children

    // 1. Parents have at most 2 children: parent = { parent: [child1,child2]}
    // 2. Each child has at most parent: children = { child: parent }
    // 3. iterates across strArr and check all conditions remain true


    public static String TreeConstructor(String[] strArr) {
        Set<String> children = new HashSet<>();
        Map<String, Integer> parents = new HashMap<>();
        for (String node : strArr) {
            String[] values = node.replaceAll("[^0-9,]", "").split(",");
            children.add(values[0]);
            Integer parentsCount = parents.get(values[1]);
            if (parentsCount != null && parentsCount + 1 > 2) {
                return "false";
            } else {
                parents.put(values[1],(parentsCount == null ? 1 : ++parentsCount));
            }
        }

        return "" + (children.size()== strArr.length);
    }


    public static void main(String[] args) {
        String[] strings = {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};
        System.out.println(TreeConstructor(strings));

        String[] strings1 = {"(1,2)", "(3,2)", "(2,12)", "(5,2)"};
        System.out.println(TreeConstructor(strings1));
    }

}
