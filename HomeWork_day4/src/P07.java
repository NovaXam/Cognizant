import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 3/8/18.
 */
public class P07 {
    private List<String> myList;

    public List<String> flattern(List<List<String>> list) {
        Iterator it = list.iterator();
        while(it.hasNext()) {
            if (it.next() instanceof String) {
                myList.add((String)it.next());
            };
            return flattern((List)it.next());
        };
        return myList;
    };
}
