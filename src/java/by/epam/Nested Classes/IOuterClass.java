

public interface IOuterClass {

    //Inner class in interface is static by default
    class InnerClass extends OuterClass implements Cloneable{ // Inner class can extend other classes and implement interfaces
        private static long id;

        //inner class can encapsulate non static fields
        private String name;

        public static long getId() {
            return id;
        }
    }

}


class IActions{
    private static long id;

    public static void main(String[] args) {
        //static methods of inner class can be accessed by the full name
        id = IOuterClass.InnerClass.getId();
    }
}

