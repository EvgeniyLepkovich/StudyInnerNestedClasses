package by.epam.nested;

import java.io.Serializable;

/**
 * Inheritance with generics examples
 */
public class GenericsExamples<T, O> {

    //nested class can be generic
    static class GenericNested<T, O> {}

    //it also work fine
    static class ExtendsOuter1<T, O> extends GenericsExamples<Number, Serializable> {}

    //this one too
    static class ExtendsOuter2<T extends Number, O> extends GenericsExamples<T, O> {}
}
