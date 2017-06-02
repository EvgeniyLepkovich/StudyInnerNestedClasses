package anonymous;

//we can run new threads
public class ThreadExample {

    public void startNewThread(){
        new Thread()
        {
            public void run() {
                //perform task
            }
        }.start();
    }
}
