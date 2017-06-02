package by.epam.inner;

public class InheritanceImplementationExample implements Runnable{

    public void outerMethod(){}

    @Override
    public void run() { }

    // Inner class has ability to extend outer class (or other) and to implement interfaces
    // Inner class can act as super class for other inner classes
    public abstract class AbstractExtendedClass extends InheritanceImplementationExample implements Comparable<String> {

        @Override
        public int compareTo(String o) { return 0;}
    }

    public final class FinalExtendedClass extends AbstractExtendedClass {

        @Override
        public void outerMethod() { }

        @Override
        public void run() { }
    }

}

class ExtendedPublicInnerClass extends InheritanceImplementationExample.AbstractExtendedClass {

}
/*
Will not compile because of lack of OuterClass.PublicInnerClass instance
class ExtendedPublicInnerClass extends InheritanceImplementationExample.FinalExtendedClass{

}*/
