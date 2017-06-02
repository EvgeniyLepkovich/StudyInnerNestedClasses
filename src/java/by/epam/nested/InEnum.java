package by.epam.nested;

public enum InEnum {
    ;

    //allowed here
    static class Nested {
        public static void method() {
            System.out.println("Nested class in enum"); //InEnum.Nested.method();
        }
    }
}
