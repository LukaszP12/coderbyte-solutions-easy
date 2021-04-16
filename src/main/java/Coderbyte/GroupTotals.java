package Coderbyte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GroupTotals {

    public static String GroupTotals(String[] strArr) {

        Map<String,Integer> map = new HashMap<String,Integer>();

        for (int i=0;i<strArr.length;i++){
            String[] split = strArr[i].split(":");
            int value = Integer.valueOf(split[1]);
            if (map.get(split[0]) == null){
                map.put(split[0],0);
            }
            map.put(split[0],map.get(split[0]) + value);
        }


        ArrayList<String> names = new ArrayList<>(map.keySet());
        Collections.sort(names);
        StringBuilder result = new StringBuilder();

        for (String s : names){
            int val = map.get(s);
            if (val == 0) continue;
            if (result.length() != 0){
                result.append(",");
            }
            result.append(s + ":" + map.get(s));
        }

        return result.toString();
    }


    public static void main(String[] args) {
        String[] strings = {"X:-1", "Y:1", "X:-4", "B:3", "X:5"};
        System.out.println(GroupTotals(strings));
    }

}