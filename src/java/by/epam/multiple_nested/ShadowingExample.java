package by.epam.multiple_nested;

/**
 *
 */

public class ShadowingExample {
    public static void main(String[] args) {
        ShadowingOuter.Nested.NestedNested nestedNested;
        nestedNested = new ShadowingOuter.Nested.NestedNested();
        nestedNested.printFields(); // a = 2
    }
}

class ShadowingOuter {
    private static int a = 1; // Shadowed

    static class Nested {
        private static int a = 2;

        {
            System.out.println(a); // a = 2
        }

        static class NestedNested {
            void printFields() {
                System.out.println("a = " + a); // a = 2
            }
        }
    }
}
