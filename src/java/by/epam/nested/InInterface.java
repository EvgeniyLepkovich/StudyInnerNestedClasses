package by.epam.nested;

public interface InInterface {

    //all classes in interface 'static' by default
    static class Nested {
        public static void method() {
            System.out.println("Nested class in interface");// InInterface.Nested.method();
        }
    }
}