package ConsumerPackage;

public class FunctionalInterface1Class {
    public static void main(String[] args) {
        FunctionalInterface1 functionalInterface1 = (a, b) -> a+" "+b;
        System.out.println(functionalInterface1.concanate("Hello", "Rajeev"));


    }
}
