package by.epam.inner;

public class OuterClass {

    public class PublicInnerClass { }

    protected class ProtectedInnerClass { }

    class PackageInnerClass { }

    private class PrivateInnerClass { }

    abstract class AbstractInnerClass { }

    final class FinalInnerClass { }

    public void proccessClasses(){
        PublicInnerClass publicInnerClass = new PublicInnerClass();
        ProtectedInnerClass protectedInnerClass = new ProtectedInnerClass();
        PackageInnerClass packageInnerClass = new PackageInnerClass();
        PrivateInnerClass privateInnerClass = new PrivateInnerClass();
    }

}

class UsageExample {

    public static void main(String[] args) {
        OuterClass.PublicInnerClass publicInnerClass = new OuterClass().new PublicInnerClass();
        OuterClass.ProtectedInnerClass protectedInnerClass = new OuterClass().new ProtectedInnerClass();
        OuterClass.PackageInnerClass packageInnerClass = new OuterClass().new PackageInnerClass();

        // Will not compile
        // OuterClass.PrivateInnerClass privateInnerClass = new OuterClass().new PrivateInnerClass();
    }

}




