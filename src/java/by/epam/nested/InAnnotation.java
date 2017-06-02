package by.epam.nested;

public @interface InAnnotation {

    //by default all classes in annotation 'static'
    static class Nested {
        public static void method() {
            System.out.println("Nested class in annotation"); //InAnnotation.Nested.method();
        }
    }
}
