package pl;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class CharSequenceVsString {

//    Simply put, CharSequence and String are two different fundamental concepts in Java.

//    Mutability is not enforced by this interface.
//    Therefore, both mutable and immutable classes implement this interface.

    final static CharSequence charSequence = "charSequence";

    final static CharSequence charSequence1 = new StringBuilder("charSequence");


//    String is a sequence of characters in Java.
//    It is an immutable class and one of the most frequently used types in Java.
//    This class implements the CharSequence, Serializable, and Comparable<String> interfaces.

    final static String test = "charSequence";

    @Test
    public static void main(String[] args) {
        assertNotEquals(charSequence,test);
    }

}
