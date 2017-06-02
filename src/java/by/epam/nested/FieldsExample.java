package by.epam.nested;

/**
 * Possible issues with fields examples
 */
public class FieldsExample {
    private int a = 1;
    int b = 2;
    protected int c = 3;
    private static int D = 4;
    public static int E = 5;

    private static int H = 10;

    private static void staticMethod() {/*NOP*/}

    private static void hiding() {/*NOP*/}

    static class Nested {
        private int f = 6; //this is your field
        private static int J = 7; //FieldsExample.Nested.J

        private int H = 20; //hiding

        private void hiding() {/*NOP*/}

        {
            //You can't use non-static fields
            //System.out.println(a); //error
            //System.out.println(b); //error
            //System.out.println(c); //error

            System.out.println(D); //ok (private it's okay)
            System.out.println(FieldsExample.D); //ok

            System.out.println(E); //no matter is it private or not

            System.out.println(H); //20
            System.out.println(FieldsExample.H); //10

            staticMethod(); //you have access

            hiding(); //from Nested

            FieldsExample.hiding(); //from Outer
        }
    }
}
