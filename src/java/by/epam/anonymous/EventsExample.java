package anonymous;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//we can handle events
public class EventsExample {

    public ActionListener getActonListner() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Some actions performed.
            }
        };

    }
}
