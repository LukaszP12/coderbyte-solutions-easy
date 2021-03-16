package pl;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("puppy",5);
        Animal animal = new Dog("puppy",5);
        animal.makeSound();

        //animal.eat(); // this does not work, as we only have access to overridden methods
        ((Dog) animal).eat(); // it works only after casting

        animal = (Dog) animal;
        animal.makeSound(); // it is still a dog, as it is not possible reverse a once overriden method
                            // when upcasting


        Animal puppy = new Animal(){
            @Override
            public void makeSound() {
                System.out.println("I am a puppy now");
            }
        };
        puppy.makeSound();

    }

    Cat cat = new Cat();
    Animal animal = cat;
//    animal.meow();

}
