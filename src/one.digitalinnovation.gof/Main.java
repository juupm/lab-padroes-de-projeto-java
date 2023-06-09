package one.digitalinnovation.gof;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Singleton 1: " + singleton1.getMessage());
        System.out.println("Singleton 2: " + singleton2.getMessage());

        System.out.println("Eles sao partem da mesma instancia? " + (singleton1 == singleton2));
    }
}