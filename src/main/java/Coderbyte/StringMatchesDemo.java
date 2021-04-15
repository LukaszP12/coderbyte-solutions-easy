package Coderbyte;

public class StringMatchesDemo {

//    String matches() : This method tells whether or not this
//    string matches the given regular expression. An invocation of this method of the form

    public static void main(String[] args) {
        String Str = new String("Welcome to geeksforgeeks");

        // Testing if regex is present
        System.out.print("Does String contains regex (.*)geeks(.*) ? : " );
        System.out.println(Str.matches("(.*)geeks(.*)"));

        // Testing if regex is present
        System.out.print("Does String contains regex geeks ? : " );
        System.out.println(Str.matches("geeks"));
    }

}
