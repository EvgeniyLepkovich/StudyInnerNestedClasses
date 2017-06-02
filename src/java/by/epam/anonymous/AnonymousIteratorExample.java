package anonymous;

import java.util.Iterator;


//we can implement interfaces
public class AnonymousIteratorExample {

    public Iterable getUselessIterator() {
        return new Iterable() {
            @Override
            public Iterator iterator() {
                return null;
            }
        };

    }
}
