package by.epam.local;

/**
 * Created by Yayheniy_Lepkovich on 6/2/2017.
 */
public class UseExamples {
    class InnerClass<T>{
        public String toString(){
            return "Hello world";
        }
    }

    public String toString(){
        //local class can be generic and can extend other classes
        class Local<T> extends InnerClass<String> {
            public String toString(){
                return super.toString();
            }
        }
        Local<String> local = new Local();
        return local.toString();
    }
}
