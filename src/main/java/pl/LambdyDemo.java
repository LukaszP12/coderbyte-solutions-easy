package pl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class LambdyDemo {


    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Dorota");
        names.add("Jacek");
        names.add("Kasia");
        names.add("Wacek");
        names.add("Robert");
        names.add("Damian");
        names.add("Jarosław");

        List<String> modifiedNames = new ArrayList<>();
        Random random = new Random();
        for (String name : names){
//            name + " " + random.nextInt(11)
//            String modifiedName = ;
            modifiedNames.add(name);
        }

        System.out.println(modifiedNames);

//        private static String modify(String string,Modifier modifier){
//
//        }


        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        Comparator<String> stringComparator = Comparator.comparingInt(String::length);
        names.sort(stringComparator);

        names.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));

        System.out.println(names);

    }


}
