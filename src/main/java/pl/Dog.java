package pl;

public class Dog extends Animal {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Dog() {

    }

    public void eat() {
        System.out.println("The dog is eating right now");
    }

    @Override
    public void makeSound() {
        System.out.println("I am a dog");
    }

}
