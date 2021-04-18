package pl;

public class InvalidPeselException extends Exception {

    public InvalidPeselException(String message) {
        super(message);
        message = "The given pesel is wrong";
    }

}
