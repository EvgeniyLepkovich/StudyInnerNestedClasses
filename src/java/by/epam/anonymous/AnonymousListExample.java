package anonymous;

import java.util.ArrayList;
import java.util.List;

//we can make a unique object
public class AnonymousListExample {

    public List<String> getFilledList (String[] args) {
        return new ArrayList<String>(){{
            add("That");
            add("List");
            add("Already");
            add("Filled");
        }};
    }

}
