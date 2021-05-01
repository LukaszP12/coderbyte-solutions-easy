package pl;

import java.util.List;

public class ListsDemo {

    public static void main(String[] args) {
        Pair<String,String> strings = new Pair<>("Hello", "World");
        Pair<Integer,Integer> integers = new Pair<>(42, 500);

        System.out.println(strings);
        System.out.println(integers);

        Pair<Person,Person> people = new Pair<>(new Person("Richard"),new Person("Casey"));

        System.out.println(people);

        Pair<String,Integer> stringIntegerPair = new Pair<String,Integer>("Hello",42);

        String first = stringIntegerPair.getFirst();
        Integer second = stringIntegerPair.getSecond();

    }

    public static class Pair<T,S> {
        private final T first;
        private final S second;

        public Pair(T first, S second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first='" + first + '\'' +
                    ", second='" + second + '\'' +
                    '}';
        }
    }

    public static class Person {

        private final String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

}
