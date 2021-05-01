package pl;

import java.util.HashMap;
import java.util.Map;

public class HashTestApp {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Susie",3);
        Cat cat2 = new Cat("Susie",3);

        System.out.println(cat1.equals(cat2));

        Map<Cat,String> catStringMap = new HashMap<>();
        catStringMap.put(cat1,"value 1");
        catStringMap.put(cat2,"value 2");

        System.out.println(catStringMap.get(cat1));
        System.out.println(catStringMap.get(cat2));

    }


    private static class Cat {
        String name;
        int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
