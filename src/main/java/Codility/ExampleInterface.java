package Codility;

public interface ExampleInterface {

    public void talking();

    public default void talkingToo(){
        System.out.println("I can of course talk, I am default method");
    }

    public static void talkingMore(){
        System.out.println("Talking as static method");
    }

}
