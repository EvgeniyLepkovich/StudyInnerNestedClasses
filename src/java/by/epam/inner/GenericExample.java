package by.epam.inner;

public class GenericExample<G, N extends Number> {

    public G gField;
    public N nField;

    public class InnerClass{
        public G gInnerField;
        public N nInerField;
    }

    public class FirstExteendedInnerClass extends GenericExample<Number, Integer> { }

    // wildcard and super are not allowed in inner class's generics
    public class SecondExteendedInnerClass<S extends Number> { }

}
