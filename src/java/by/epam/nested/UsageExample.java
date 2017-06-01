package by.epam.nested;

/**
 * Example of simple usage.
 *
 * Why use nested classes?
 * - It is a way of logically grouping classes that are only used in one place;
 * - It increases encapsulation;
 * - It can lead to more readable and maintainable code;
 *
 * JDK examples:
 * @see java.util.Map.Entry
 * @see java.util.LinkedList.Node
 * @see java.util.Spliterators.ArraySpliterator
 * @see java.util.Spliterators.AbstractSpliterator
 * @see Thread.WeakClassKey
 * @see java.time.Clock.SystemClock
 */
public class UsageExample {

    //'static' necessary
    static class Nested {
        {
            System.out.println("Hello, I'm static nested class :)");
        }
    }

    public static void main(String[] args) {
        //pay attention to type of variable
        UsageExample.Nested nested = new UsageExample.Nested();

        //from here this one also possible
        UsageExample.Nested another = new Nested();
    }
}
