package by.epam.inner;

public class ModifiersExample {

    public int x = 0;

    public int publicOuterInt = 1;
    private int privateOuterInt = 2;

    static public int staticPublicOuterInt = 3;
    static private int staticPrivateOuterInt = 4;

    final public int finalPublicOuterInt = 5;
    final private int finalPrivateOuterInt = 6;

    static final public int staticFinalPublicOuterInt = 7;
    static final private int staticFinalPrivateOuterInt = 8;

    public void publicOuterMethod(){}
    private void privateOuterMethod(){}

    static public void staticPublicOuterMethod(){}
    static private void staticPrivateOuterMethod(){}

    // Outer class has access to all inner class's class member through inner class instance
    public void processOuterClassMembers(){
        InnerClass innerClass = new InnerClass();
        innerClass.privateInnerInt = 0;
        innerClass.privateInnerInt = 0;

        System.out.println(innerClass.finalPublicInnerInt);
        System.out.println(innerClass.finalPrivateInnerInt);
        System.out.println(InnerClass.staticFinalPublicInnerInt);
        System.out.println(InnerClass.staticFinalPrivateInnerInt);

        innerClass.publicInnerMethod();
        innerClass.privateInnerMethod();
    }

    public class InnerClass{

        public int x = 1;

        public int publicInnerInt = 1;
        private int privateInnerInt = 2;

        // Will not compile because of static modifier without final
        //static public int staticPublicInnerInt = 3;

        final public int finalPublicInnerInt = 5;
        final private int finalPrivateInnerInt = 6;

        static final public int staticFinalPublicInnerInt = 7;
        static final private int staticFinalPrivateInnerInt = 8;

        public void publicInnerMethod(){}
        private void privateInnerMethod(){}

        // Will not compile because of static modifier without final
        // static public void staticPublicInnerMethod(){}

        // Inner class has access to all outer class's class members
        public void processOuterClassMembers(){
            publicOuterInt = 0;
            privateOuterInt = 0;
            staticPublicOuterInt = 0;
            staticPrivateOuterInt = 0;
            System.out.println(finalPublicOuterInt);
            System.out.println(finalPrivateOuterInt);
            System.out.println(staticFinalPublicOuterInt);
            System.out.println(staticFinalPrivateOuterInt);

            publicOuterMethod();
            privateOuterMethod();
            staticPublicOuterMethod();
            staticPrivateOuterMethod();

            // Reference to inner's outer class
            System.out.println(this);
        }

        public void proccessX(){
            System.out.println(x);  // will print 1
            System.out.println(ModifiersExample.this.x);   // will print 0
        }

    }

}

