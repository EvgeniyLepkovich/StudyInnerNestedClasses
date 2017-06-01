package by.epam.nested;

/**
 * Allowed modifiers examples
 */
public class ModifiersExample {
    //public allowed
    public static class PublicNested {
        {
            System.out.println("public");
        }
    }

    //without access modifier
    static class DefaultNested {
        {
            System.out.println("default modifier (package private)");
        }
    }

    //protected allowed
    protected static class ProtectedNested {
        {
            System.out.println("protected");
        }
    }

    //private allowed
    private static class PrivateNested {
        {
            System.out.println("private");
        }
    }

    //final allowed
    static final class FinalNested {
        {
            System.out.println("final");
        }
    }

    //strictfp allowed
    static strictfp class StrictfpNested {
        {
            System.out.println("strictfp");
        }
    }

    //abstract allowed
    static abstract class AbstractNested {
        {
            System.out.println("abstract");
        }

        public abstract void abstractMethod();
    }

    // definitely compile error
    //static final abstract class FinalAbstract {}

    public static void main(String[] args) {
        ModifiersExample.PublicNested publicNested = new ModifiersExample.PublicNested();
        ModifiersExample.DefaultNested defaultNested = new ModifiersExample.DefaultNested();
        ModifiersExample.ProtectedNested protectedNested = new ModifiersExample.ProtectedNested();
        ModifiersExample.PrivateNested privateNested = new ModifiersExample.PrivateNested();
        ModifiersExample.FinalNested finalNested = new ModifiersExample.FinalNested();
        ModifiersExample.StrictfpNested strictfpNested = new ModifiersExample.StrictfpNested();
        //ModifiersExample.AbstractNested abstractNested = new ModifiersExample.AbstractNested(); //error (abstract)
    }
}