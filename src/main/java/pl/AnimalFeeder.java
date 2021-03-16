package pl;

import java.util.ArrayList;
import java.util.List;

public class AnimalFeeder {

    public void feed(List<Animal> animals){
        animals.forEach(animal -> {
          animal.drink();
        });
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());

        new AnimalFeeder().feed(animals);

        Mew mew = new Cat();
        mew.meow();
    }


}
