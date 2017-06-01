

public class OuterClass {
    private static long id;
    private String name;

    static class InnerClass{
        private static long id;
        private String name;

        InnerClass(){
            id = OuterClass.id; //Inner class can take access to static fields of Outer class

            //To take access to non static fields of outer class we have to create object of outer class
            //name = OuterClass.name;
            OuterClass outerClass = new OuterClass();
            name = outerClass.name;

        }
    }


}


class Actions extends OuterClass.InnerClass{
    private static long id;

    public static void main(String[] args) {
        OuterClass.InnerClass innerClass  = new OuterClass.InnerClass(); // to create object of inner class we doesn't need
                                                                          // the object of outer class

        //fields of outer class can not be accessed from subclass of inner class
        //id = OuterClass.id;

    }
}