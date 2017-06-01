package by.epam.nested;

import java.io.Serializable;
import java.util.RandomAccess;

/**
 * Inheritance and implementation examples
 */
public class InheritanceExample implements Runnable {

    public void publicOuterMethod() {
        System.out.println("Oooh yeeeah!");
    }

    private void privateOuterMethod() {
        System.out.println("Don't ever touch me, I'm private!");
    }

    //extends allowed
    static class ExtendsNested extends Object {}

    //implements allowed
    static class ImplementsNested implements RandomAccess, Serializable, Cloneable {}

    //extends outer class
    //why not?
    static class ExtendsOuterClass extends InheritanceExample {
        //So you can override public methods
        @Override
        public void publicOuterMethod() {
            System.out.println("Make it");
        }

        //here also can be overriding of 'run' method

        // but you can't see private method (usual case)
        //@Override //error (not overriding)
        private void privateOuterMethod() {
            System.out.println("Not today");
        }
    }

    //implement outer class interfaces also allowed
    static class ImplementsOuterInterfaces implements Runnable {
        @Override
        public void run() {
            System.out.println("You should do it");
        }
    }

    //even this will work
    static class NestedExtendsNested extends ImplementsOuterInterfaces {}

    //by default enum in classes marked as 'static'
    static enum Numbers {
        ONE, TWO, THREE //InheritanceExample.Numbers.ONE;
    }

    //inner interfaces also 'static' by default
    static interface Nestable {} //implements InheritanceExample.Nestable

    //annotations also 'static' by default
    static @interface Annotation {} //@InheritanceExample.Annotation

    @Override
    public void run() {
        /*NOP*/
    }
}