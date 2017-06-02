package by.epam.multiple_nested;

/**
 *
 */
public class MultipleNestingExample {
    public static void main(String[] args) {
        MultipleNestingOuter.Nested.NestedNested.print();

        /* initialization of Nested class is required */
        MultipleNestingOuter.Nested.NestedInner nestedInner =
                new MultipleNestingOuter.Nested().new NestedInner();
        nestedInner.print();

        /* initializations of Inner and MultipleNestingOuter classes are required */
        MultipleNestingOuter.Inner.InnerNested innerNested =
                new MultipleNestingOuter().new Inner().new InnerNested();
        innerNested.print();
    }
}

class MultipleNestingOuter {
    static class Nested {
        // Possible access modifiers:  private, protected, public, package-level
        // Possible modifiers: abstract, final, strictfp
        static class NestedNested {
            static void print() {
                System.out.println("NestedNested");
            }
        }

        // Possible modifiers: the same as for static nested classes
        class NestedInner {
            void print() {
                System.out.println("NestedInner");
            }
        }
    }

    class Inner {
        // Possible modifiers: the same as for static nested classes
        // BUT it could not contain static nested classes
        class InnerNested {
            void print() {
                System.out.println("InnerNested");
            }
        }
    }
}

