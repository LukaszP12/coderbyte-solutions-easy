package Codility;

public class ExampleClass implements ExampleInterface {

    @Override
    public void talking() {
        System.out.println("I have overriden the method to talk");
    }

    @Override
    public void talkingToo() {
        System.out.println("I have overriden the default method in order to talk");
    }


}
