package one.digitalinnovation.gof;

public class Singleton {
    private static Singleton instance;
    private String message;

    private Singleton() {
        message = "Hello, Singleton!";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }
}
