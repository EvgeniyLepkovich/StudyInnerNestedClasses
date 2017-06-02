public class NestedInheritanceExample {
    private static long id;
    private String name;

    static class InnerClass{
        private static long id;
        private String name;

        InnerClass(){
            id = NestedInheritanceExample.id; //Inner class can take access to static fields of Outer class

            //To take access to non static fields of outer class we have to create object of outer class
            //name = NestedInheritanceExample.name;
            NestedInheritanceExample outerClass = new NestedInheritanceExample();
            name = outerClass.name;

        }
    }


}


class Actions extends NestedInheritanceExample.InnerClass{
    private static long id;

    public static void main(String[] args) {
        NestedInheritanceExample.InnerClass innerClass  = new NestedInheritanceExample.InnerClass(); // to create object of inner class we doesn't need
                                                                          // the object of outer class

        //fields of outer class can not be accessed from subclass of inner class
        //id = NestedInheritanceExample.id;

    }
}