package by.epam.nested;

public class GenericsUsing<T> {
    T type;

    interface InnerInterface {
        //The type T is not available here
        //T type;
    }
}
