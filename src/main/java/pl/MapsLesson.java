package pl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsLesson {


    public static void main(String[] args) {
        LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
        // HashMap implements the Map interface
        dictionary.put("Brave", "ready to face and endure danger or pain; showing courage");
        dictionary.put("Brilliant", "exceptionally clever or talented");
        dictionary.put("Joy", "a feeling of great pleasure and happiness");
        dictionary.put("Confidence", "the state of feeling certain about the truth of something");

        for (String word : dictionary.keySet()) {
            System.out.println(word);
        }

        for (String description : dictionary.values()) {
            System.out.println(description);
        }

//        HashMap is random
//        LinkedHashMap preserves the order of insertion

        for (String word : dictionary.keySet()) {
            dictionary.get(word);
        }

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // TreeMap maints natural order
        System.out.println("TreeMap mains natural order");
        TreeMap<String, String> dictionary1 = new TreeMap<String, String>();
        // HashMap implements the Map interface
        dictionary1.put("Brave", "ready to face and endure danger or pain; showing courage");
        dictionary1.put("Brilliant", "exceptionally clever or talented");
        dictionary1.put("Joy", "a feeling of great pleasure and happiness");
        dictionary1.put("Confidence", "the state of feeling certain about the truth of something");

        for (Map.Entry<String, String> entry : dictionary1.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

}
