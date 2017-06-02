package by.epam.nested;

import java.io.Serializable;
import java.util.RandomAccess;

/**
 * Inheritance and implementation examples
 */
public class InheritanceExample implements Runnable {

    public void publicOuterMethod() {/*NOP*/}

    private void privateOuterMethod() {/*NOP*/}

    //extends allowed
    static class ExtendsNested extends Object {}

    //implements allowed
    static class ImplementsNested implements RandomAccess, Serializable, Cloneable {}

    //extends outer class
    //why not?
    static class ExtendsOuterClass extends InheritanceExample {
        //So you can override public methods
        @Override
        public void publicOuterMethod() {/*NOP*/}

        //here also can be overriding of 'run' method

        // but you can't see private method (usual case)
        //@Override //error (not overriding)
        private void privateOuterMethod() {/*NOP*/}
    }

    //implement outer class interfaces also allowed
    static class ImplementsOuterInterfaces implements Runnable {
        @Override
        public void run() {/*NOP*/}
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
    public void run() {/*NOP*/}
}