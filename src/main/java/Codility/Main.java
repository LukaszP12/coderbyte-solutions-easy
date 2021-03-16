package Codility;

public class Main {

    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.talking();
        exampleClass.talkingToo();

        System.out.println("Now the ExampleClass2: ");
        ExampleClass2 exampleClass2 = new ExampleClass2();
        exampleClass2.talking();

        ExampleInterface.talkingMore();

    }

}
